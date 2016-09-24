package com.qinjiangbo.dao;

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
}
