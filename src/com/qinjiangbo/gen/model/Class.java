package com.qinjiangbo.gen.model;

import java.io.Serializable;

public class Class implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table class
     *
     * @mbg.generated Tue Sep 27 00:35:28 CST 2016
     */
    private static final long serialVersionUID = 1L;
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column class.c_id
     *
     * @mbg.generated Tue Sep 27 00:35:28 CST 2016
     */
    private Integer cId;
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column class.c_name
     *
     * @mbg.generated Tue Sep 27 00:35:28 CST 2016
     */
    private String cName;
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column class.t_id
     *
     * @mbg.generated Tue Sep 27 00:35:28 CST 2016
     */
    private Integer tId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column class.c_id
     *
     * @return the value of class.c_id
     *
     * @mbg.generated Tue Sep 27 00:35:28 CST 2016
     */
    public Integer getcId() {
        return cId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column class.c_id
     *
     * @param cId the value for class.c_id
     *
     * @mbg.generated Tue Sep 27 00:35:28 CST 2016
     */
    public void setcId(Integer cId) {
        this.cId = cId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column class.c_name
     *
     * @return the value of class.c_name
     *
     * @mbg.generated Tue Sep 27 00:35:28 CST 2016
     */
    public String getcName() {
        return cName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column class.c_name
     *
     * @param cName the value for class.c_name
     *
     * @mbg.generated Tue Sep 27 00:35:28 CST 2016
     */
    public void setcName(String cName) {
        this.cName = cName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column class.t_id
     *
     * @return the value of class.t_id
     *
     * @mbg.generated Tue Sep 27 00:35:28 CST 2016
     */
    public Integer gettId() {
        return tId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column class.t_id
     *
     * @param tId the value for class.t_id
     *
     * @mbg.generated Tue Sep 27 00:35:28 CST 2016
     */
    public void settId(Integer tId) {
        this.tId = tId;
    }
}