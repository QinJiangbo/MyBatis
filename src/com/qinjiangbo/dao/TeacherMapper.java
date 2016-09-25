package com.qinjiangbo.dao;

import com.qinjiangbo.pojo.Teacher;

import java.util.List;
import java.util.Map;

/**
 * Date: 24/09/2016
 * Author: qinjiangbo@github.io
 */
public interface TeacherMapper {

    /**
     * 调用存储过程
     *
     * @param map
     * @return
     */
    public void countTeacherNumber(Map map);

    /**
     * 根据编号列表查找教师信息
     *
     * @param ids List
     * @return
     */
    public List<Teacher> findTeachersByIds(List<Integer> ids);

    /**
     * 根据编号列表查找教师信息
     *
     * @param ids Array
     * @return
     */
    public List<Teacher> findTeachersByIds2(int[] ids);

    /**
     * 根据名称前缀获取教师信息
     *
     * @param prefix
     * @return
     */
    public List<Teacher> findTeacherByNamePrefix(String prefix);
}
