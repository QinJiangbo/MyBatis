package com.qinjiangbo.dao;

import com.qinjiangbo.pojo.Classes;

import java.util.List;

/**
 * Date: 9/16/16
 * Author: qinjiangbo@github.io
 */
public interface ClassesMapper {

    /**
     * 根据编号查找班级信息
     *
     * @param id
     * @return
     */
    public Classes findClassById(int id);

    public Classes findClassById2(int id);

    public Classes findClassById3(int id);

    public Classes findClassById4(int id);
}
