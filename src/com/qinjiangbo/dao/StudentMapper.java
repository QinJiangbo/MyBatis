package com.qinjiangbo.dao;

import com.qinjiangbo.pojo.Student;

import java.util.Map;

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

    /**
     * 查找学生基本信息
     *
     * @param id
     * @return
     */
    public Map findStudentBasicInfo(Integer id);
}
