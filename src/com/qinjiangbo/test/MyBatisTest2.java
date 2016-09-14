package com.qinjiangbo.test;

import com.qinjiangbo.dao.UserMapperC;
import com.qinjiangbo.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

/**
 * Date: 9/13/16
 * Author: qinjiangbo@github.io
 */
public class MyBatisTest2 {

    private SqlSession sqlSession = null;

    @Before
    public void init() {
        String config = "com/qinjiangbo/conf/configure.xml";
        InputStream inputStream = MyBatisTest2.class.getClassLoader().getResourceAsStream(config);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        sqlSession = sqlSessionFactory.openSession();
    }

    /**
     * BASED ON XML
     */

    // C
    @Test
    public void testCreateUser() {
        // 这里需要指明是Mapper中的哪个方法
        String statement = "com.qinjiangbo.dao.UserMapper.createUser";
        User user = new User(580327, "Xinxin", "123456", 23, "123abc@126.com", "13888899211", "Wuhan University");
        sqlSession.insert(statement, user);
    }

    // D
    @Test
    public void testDeleteUser() {
        String statement = "com.qinjiangbo.dao.UserMapper.deleteUser";
        sqlSession.delete(statement, 580327);
    }

    // U
    @Test
    public void testUpdateUser() {
        User user = new User(580314, "QinJiangbo", "123456", 23, "123abc@126.com", "13888899211", "Wuhan University");
        String statement = "com.qinjiangbo.dao.UserMapper.updateUser";
        sqlSession.update(statement, user);
    }

    // R
    @Test
    public void testRetrieveUser() {
        String statement = "com.qinjiangbo.dao.UserMapper.findUserById";
        User user = sqlSession.selectOne(statement, 580314);
        System.out.println(user);
    }

    /**
     * BASED ON ANNOTATION
     */

    // C
    @Test
    public void testCreateUser2() {
        UserMapperC userMapperC = sqlSession.getMapper(UserMapperC.class);
        User user = new User(580327, "Xinxin", "123456", 23, "123abc@126.com", "13888899211", "Wuhan University");
        userMapperC.createUser(user);
    }

    @Test
    public void testDeleteUser2() {
        UserMapperC userMapperC = sqlSession.getMapper(UserMapperC.class);
        userMapperC.deleteUser(580327);
    }

    @Test
    public void testUpdateUser2() {
        UserMapperC userMapperC = sqlSession.getMapper(UserMapperC.class);
        User user = new User(580314, "Handsome", "123456", 23, "123abc@126.com", "13888899211", "Wuhan University");
        userMapperC.updateUser(user);
    }

    @Test
    public void testRetrieveUser2() {
        UserMapperC userMapperC = sqlSession.getMapper(UserMapperC.class);
        User user = userMapperC.retrieveUser(580314);
        System.out.println(user);
    }

    @After
    public void commit() {
        sqlSession.commit();
    }

}
