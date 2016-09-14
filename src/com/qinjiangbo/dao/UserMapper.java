package com.qinjiangbo.dao;

import com.qinjiangbo.pojo.User;

/**
 * Date: 9/14/16
 * Author: qinjiangbo@github.io
 */
public interface UserMapper {

    public User findUserById(int id);

    public int createUser(User user);

    public int updateUser(User user);

    public int deleteUser(int id);

}
