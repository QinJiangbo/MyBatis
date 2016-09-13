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
        // 注意这个地方,不少人会直接写configure.xml, 这样会一直取不到值,从而报空指针,
        // 需要写全这个资源的全路径
        String config = "com/qinjiangbo/conf/configure.xml";
        InputStream inputStream = MyBatisTest1.class.getClassLoader().getResourceAsStream(config);
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = factory.openSession();
        String statement = "com.qinjiangbo.dao.UserMapper.findUserById";
        User user = sqlSession.selectOne(statement, 580314);
        System.out.println(user);
    }
}
