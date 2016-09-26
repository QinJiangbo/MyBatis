package com.qinjiangbo.gen.model;

import java.io.Serializable;

public class Teacher implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table teacher
     *
     * @mbg.generated Mon Sep 26 23:39:30 CST 2016
     */
    private static final long serialVersionUID = 1L;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.t_id
     *
     * @mbg.generated Mon Sep 26 23:39:30 CST 2016
     */
    private Integer tId;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.t_name
     *
     * @mbg.generated Mon Sep 26 23:39:30 CST 2016
     */
    private String tName;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.t_office
     *
     * @mbg.generated Mon Sep 26 23:39:30 CST 2016
     */
    private String tOffice;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.t_gender
     *
     * @mbg.generated Mon Sep 26 23:39:30 CST 2016
     */
    private String tGender;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.t_id
     *
     * @return the value of teacher.t_id
     * @mbg.generated Mon Sep 26 23:39:30 CST 2016
     */
    public Integer gettId() {
        return tId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.t_id
     *
     * @param tId the value for teacher.t_id
     * @mbg.generated Mon Sep 26 23:39:30 CST 2016
     */
    public void settId(Integer tId) {
        this.tId = tId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.t_name
     *
     * @return the value of teacher.t_name
     * @mbg.generated Mon Sep 26 23:39:30 CST 2016
     */
    public String gettName() {
        return tName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.t_name
     *
     * @param tName the value for teacher.t_name
     * @mbg.generated Mon Sep 26 23:39:30 CST 2016
     */
    public void settName(String tName) {
        this.tName = tName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.t_office
     *
     * @return the value of teacher.t_office
     * @mbg.generated Mon Sep 26 23:39:30 CST 2016
     */
    public String gettOffice() {
        return tOffice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.t_office
     *
     * @param tOffice the value for teacher.t_office
     * @mbg.generated Mon Sep 26 23:39:30 CST 2016
     */
    public void settOffice(String tOffice) {
        this.tOffice = tOffice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.t_gender
     *
     * @return the value of teacher.t_gender
     * @mbg.generated Mon Sep 26 23:39:30 CST 2016
     */
    public String gettGender() {
        return tGender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.t_gender
     *
     * @param tGender the value for teacher.t_gender
     * @mbg.generated Mon Sep 26 23:39:30 CST 2016
     */
    public void settGender(String tGender) {
        this.tGender = tGender;
    }
}