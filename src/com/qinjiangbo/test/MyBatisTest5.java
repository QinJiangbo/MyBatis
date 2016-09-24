package com.qinjiangbo.test;

import com.qinjiangbo.dao.TeacherMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * Date: 24/09/2016
 * Author: qinjiangbo@github.io
 */
public class MyBatisTest5 {

    private SqlSession sqlSession = null;

    @Before
    public void init() {
        String config = "com/qinjiangbo/conf/configure.xml";
        InputStream inputStream = MyBatisTest2.class.getClassLoader().getResourceAsStream(config);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        sqlSession = sqlSessionFactory.openSession();
    }

    @Test
    public void testInvokeProcedure() {
        Map<String, Integer> map = new HashMap<>();
        map.put("t_sex", 1);
        map.put("user_count", 0);
        TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);
        teacherMapper.countTeacherNumber(map);
        System.out.println(map.get("user_count"));
    }

    @After
    public void commit() {
        sqlSession.commit();
    }
}
