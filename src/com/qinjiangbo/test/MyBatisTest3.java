package com.qinjiangbo.test;

import com.qinjiangbo.dao.StudentMapper;
import com.qinjiangbo.pojo.Student;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.Map;

/**
 * Date: 9/16/16
 * Author: qinjiangbo@github.io
 */
public class MyBatisTest3 {

    private SqlSession sqlSession = null;

    @Before
    public void init() {
        String config = "com/qinjiangbo/conf/configure.xml";
        InputStream inputStream = MyBatisTest2.class.getClassLoader().getResourceAsStream(config);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        sqlSession = sqlSessionFactory.openSession();
    }

    @Test
    public void testFindStudentInfo() {
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        Student student = studentMapper.findStudentInfo(580314);
        System.out.println(student);
    }

    @Test
    public void testFindStudentBasicInfo() {
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        Map map = studentMapper.findStudentBasicInfo(580314);
        System.out.println(map.get("name") + ":" + map.get("password"));
    }

    @After
    public void commit() {
        sqlSession.commit();
    }
}
