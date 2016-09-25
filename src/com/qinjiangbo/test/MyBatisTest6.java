package com.qinjiangbo.test;

import com.qinjiangbo.dao.TeacherMapper;
import com.qinjiangbo.pojo.Teacher;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Date: 25/09/2016
 * Author: qinjiangbo@github.io
 */
public class MyBatisTest6 {

    private SqlSession sqlSession = null;

    @Before
    public void init() {
        String config = "com/qinjiangbo/conf/configure.xml";
        InputStream inputStream = MyBatisTest2.class.getClassLoader().getResourceAsStream(config);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        sqlSession = sqlSessionFactory.openSession();
    }

    @Test
    public void testFindTeacherByIds() {
        TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);
        List<Integer> ids = new ArrayList<Integer>();
        ids.add(1002);
        ids.add(1003);
        ids.add(1006);
        List<Teacher> teachers = teacherMapper.findTeachersByIds(ids);
        Iterator<Teacher> iterator = teachers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    @Test
    public void testFindTeacherByIds2() {
        TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);
        int[] ids = new int[]{1002, 1004, 1005};
        List<Teacher> teachers = teacherMapper.findTeachersByIds2(ids);
        Iterator<Teacher> iterator = teachers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    @Test
    public void testFindTeacherByNamePrefix() {
        TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);
        List<Teacher> teachers = teacherMapper.findTeacherByNamePrefix("s");
        Iterator<Teacher> iterator = teachers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    @Test
    public void testUpdateTeacherInfo() {
        TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = new Teacher();
        teacher.setId(1003);
        teacher.setName("QinJiangbo");
        int result = teacherMapper.updateTeacherInfo(teacher);
        System.out.println(result);
    }

    @After
    public void commit() {
        sqlSession.commit();
    }
}
