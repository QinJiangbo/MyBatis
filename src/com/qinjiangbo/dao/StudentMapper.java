package com.qinjiangbo.dao;

import com.qinjiangbo.pojo.Student;

/**
 * Date: 9/16/16
 * Author: qinjiangbo@github.io
 */
public interface StudentMapper {
    /**
     * 查找学生信息
     *
     * @param id
     * @return
     */
    public Student findStudentInfo(Integer id);
}
