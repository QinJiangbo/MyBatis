package com.qinjiangbo.gen.model;

import java.io.Serializable;

public class Users implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table users
     *
     * @mbg.generated Tue Sep 27 00:35:28 CST 2016
     */
    private static final long serialVersionUID = 1L;
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.id
     *
     * @mbg.generated Tue Sep 27 00:35:28 CST 2016
     */
    private Integer id;
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.name
     *
     * @mbg.generated Tue Sep 27 00:35:28 CST 2016
     */
    private String name;
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.pwd
     *
     * @mbg.generated Tue Sep 27 00:35:28 CST 2016
     */
    private String pwd;
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.age
     *
     * @mbg.generated Tue Sep 27 00:35:28 CST 2016
     */
    private Integer age;
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.email
     *
     * @mbg.generated Tue Sep 27 00:35:28 CST 2016
     */
    private String email;
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.tel
     *
     * @mbg.generated Tue Sep 27 00:35:28 CST 2016
     */
    private String tel;
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.addr
     *
     * @mbg.generated Tue Sep 27 00:35:28 CST 2016
     */
    private String addr;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.id
     *
     * @return the value of users.id
     *
     * @mbg.generated Tue Sep 27 00:35:28 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.id
     *
     * @param id the value for users.id
     *
     * @mbg.generated Tue Sep 27 00:35:28 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.name
     *
     * @return the value of users.name
     *
     * @mbg.generated Tue Sep 27 00:35:28 CST 2016
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.name
     *
     * @param name the value for users.name
     *
     * @mbg.generated Tue Sep 27 00:35:28 CST 2016
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.pwd
     *
     * @return the value of users.pwd
     *
     * @mbg.generated Tue Sep 27 00:35:28 CST 2016
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.pwd
     *
     * @param pwd the value for users.pwd
     *
     * @mbg.generated Tue Sep 27 00:35:28 CST 2016
     */
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.age
     *
     * @return the value of users.age
     *
     * @mbg.generated Tue Sep 27 00:35:28 CST 2016
     */
    public Integer getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.age
     *
     * @param age the value for users.age
     *
     * @mbg.generated Tue Sep 27 00:35:28 CST 2016
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.email
     *
     * @return the value of users.email
     *
     * @mbg.generated Tue Sep 27 00:35:28 CST 2016
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.email
     *
     * @param email the value for users.email
     *
     * @mbg.generated Tue Sep 27 00:35:28 CST 2016
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.tel
     *
     * @return the value of users.tel
     *
     * @mbg.generated Tue Sep 27 00:35:28 CST 2016
     */
    public String getTel() {
        return tel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.tel
     *
     * @param tel the value for users.tel
     *
     * @mbg.generated Tue Sep 27 00:35:28 CST 2016
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.addr
     *
     * @return the value of users.addr
     *
     * @mbg.generated Tue Sep 27 00:35:28 CST 2016
     */
    public String getAddr() {
        return addr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.addr
     *
     * @param addr the value for users.addr
     *
     * @mbg.generated Tue Sep 27 00:35:28 CST 2016
     */
    public void setAddr(String addr) {
        this.addr = addr;
    }
}