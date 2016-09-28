package com.qinjiangbo.test;

import com.qinjiangbo.gen.mapper.StudentMapper;
import com.qinjiangbo.gen.mapper.TeacherMapper;
import com.qinjiangbo.gen.model.Student;
import com.qinjiangbo.gen.model.StudentExample;
import com.qinjiangbo.gen.model.Teacher;
import com.qinjiangbo.gen.model.TeacherExample;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * Date: 27/09/2016
 * Author: qinjiangbo@github.io
 */
public class MyBatisTest7 {

    private SqlSession sqlSession = null;

    @Before
    public void init() {
        String config = "com/qinjiangbo/conf/configure.xml";
        InputStream inputStream = MyBatisTest2.class.getClassLoader().getResourceAsStream(config);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        sqlSession = sqlSessionFactory.openSession();
    }

    @Test
    public void testFindTeachers() {
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        TeacherExample example = new TeacherExample();
        example.createCriteria().andTGenderIsNotNull();
        List<Teacher> teacherList = mapper.selectByExample(example);
        for (Teacher teacher : teacherList) {
            System.out.println(teacher.gettName() + " " + teacher.gettGender());
        }
    }

    @Test
    public void testFindStudents() {
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        StudentExample example = new StudentExample();
        example.createCriteria().andCIdEqualTo(3);
        List<Student> studentList = mapper.selectByExample(example);
        for (Student student : studentList) {
            System.out.println(student.getsName() + " " + student.getsAge());
        }
    }

    @After
    public void commit() {
        sqlSession.commit();
    }
}
