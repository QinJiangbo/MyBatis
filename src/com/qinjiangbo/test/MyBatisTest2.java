package com.qinjiangbo.test;

import com.qinjiangbo.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
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

    @Test
    public void testCreateUser() {
        // 这里需要指明是Mapper中的哪个方法
        String statement = "com.qinjiangbo.dao.UserMapper.createUser";
        User user = new User(580327, "Xinxin", "123456", 23, "123abc@126.com", "13888899211", "Wuhan University");
        sqlSession.insert(statement, user);
        sqlSession.commit();
    }

    @Test
    public void testDeleteUser() {
        String statement = "com.qinjiangbo.dao.UserMapper.deleteUser";
        sqlSession.delete(statement, 580327);
        sqlSession.commit();
    }


}
