package com.qinjiangbo.dao;

import com.qinjiangbo.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * Date: 9/14/16
 * Author: qinjiangbo@github.io
 */
public interface UserMapperC {

    @Insert("INSERT INTO users VALUES (#{id}, #{name}, #{pwd}, #{age}, #{email}, #{tel}, #{addr})")
    public int createUser(User user);

    @Delete("DELETE FROM users WHERE id = #{id}")
    public int deleteUser(int id);

    @Update("UPDATE users SET name = #{name}, pwd = #{pwd}, age = #{age}, email = #{email}, tel = #{tel}, addr = #{addr} WHERE id = #{id}")
    public int updateUser(User user);

    @Select("SELECT * FROM users WHERE id = #{id}")
    public User retrieveUser(int id);
}
