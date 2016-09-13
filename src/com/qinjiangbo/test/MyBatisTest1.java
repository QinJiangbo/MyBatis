package com.qinjiangbo.test;

import com.qinjiangbo.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;

/**
 * Date: 9/13/16
 * Author: qinjiangbo@github.io
 */
public class MyBatisTest1 {

    @Test
    public void testFindUserById() {
        String config = "com/qinjiangbo/conf/configure.xml";
        InputStream inputStream = MyBatisTest1.class.getClassLoader().getResourceAsStream(config);
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = factory.openSession();
        String statement = "com.qinjiangbo.dao.UserMapper.findUserById";
        User user = sqlSession.selectOne(statement, 580314);
        System.out.println(user);
    }
}
