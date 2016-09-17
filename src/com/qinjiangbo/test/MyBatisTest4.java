package com.qinjiangbo.test;

import com.qinjiangbo.dao.ClassesMapper;
import com.qinjiangbo.pojo.Classes;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

/**
 * Date: 9/17/16
 * Author: qinjiangbo@github.io
 */
public class MyBatisTest4 {
    private SqlSession sqlSession = null;

    @Before
    public void init() {
        String config = "com/qinjiangbo/conf/configure.xml";
        InputStream inputStream = MyBatisTest2.class.getClassLoader().getResourceAsStream(config);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        sqlSession = sqlSessionFactory.openSession();
    }

    @Test
    public void testFindClassById() {
        ClassesMapper classesMapper = sqlSession.getMapper(ClassesMapper.class);
        Classes classes = classesMapper.findClassById(1);
        System.out.println(classes);
    }

    @Test
    public void testFindClassById2() {
        ClassesMapper classesMapper = sqlSession.getMapper(ClassesMapper.class);
        Classes classes = classesMapper.findClassById2(1);
        System.out.println(classes);
    }

    @After
    public void commit() {
        sqlSession.commit();
    }
}
