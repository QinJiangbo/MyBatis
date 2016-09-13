package com.qinjiangbo.pojo;

/**
 * Date: 9/13/16
 * Author: qinjiangbo@github.io
 */
public class User {

    // 实体类的属性名称和数据库中的字段名称要一一对应起来
    private int id;
    private String name;
    private String pwd;
    private int age;
    private String email;
    private String tel;
    private String addr;

    public User(int id, String name, String pwd, int age, String email, String tel, String addr) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
        this.age = age;
        this.email = email;
        this.tel = tel;
        this.addr = addr;
    }

    public User() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", tel='" + tel + '\'' +
                ", addr='" + addr + '\'' +
                '}';
    }
}
