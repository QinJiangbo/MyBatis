package com.qinjiangbo.gen.model;

import java.io.Serializable;

public class Orders implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table orders
     *
     * @mbg.generated Thu Oct 06 19:15:49 CST 2016
     */
    private static final long serialVersionUID = 1L;
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.order_id
     *
     * @mbg.generated Thu Oct 06 19:15:49 CST 2016
     */
    private Integer orderId;
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.order_no
     *
     * @mbg.generated Thu Oct 06 19:15:49 CST 2016
     */
    private String orderNo;
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.order_price
     *
     * @mbg.generated Thu Oct 06 19:15:49 CST 2016
     */
    private Integer orderPrice;
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.user_id
     *
     * @mbg.generated Thu Oct 06 19:15:49 CST 2016
     */
    private Integer userId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.order_id
     *
     * @return the value of orders.order_id
     *
     * @mbg.generated Thu Oct 06 19:15:49 CST 2016
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.order_id
     *
     * @param orderId the value for orders.order_id
     *
     * @mbg.generated Thu Oct 06 19:15:49 CST 2016
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.order_no
     *
     * @return the value of orders.order_no
     *
     * @mbg.generated Thu Oct 06 19:15:49 CST 2016
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.order_no
     *
     * @param orderNo the value for orders.order_no
     *
     * @mbg.generated Thu Oct 06 19:15:49 CST 2016
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.order_price
     *
     * @return the value of orders.order_price
     *
     * @mbg.generated Thu Oct 06 19:15:49 CST 2016
     */
    public Integer getOrderPrice() {
        return orderPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.order_price
     *
     * @param orderPrice the value for orders.order_price
     *
     * @mbg.generated Thu Oct 06 19:15:49 CST 2016
     */
    public void setOrderPrice(Integer orderPrice) {
        this.orderPrice = orderPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.user_id
     *
     * @return the value of orders.user_id
     *
     * @mbg.generated Thu Oct 06 19:15:49 CST 2016
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.user_id
     *
     * @param userId the value for orders.user_id
     *
     * @mbg.generated Thu Oct 06 19:15:49 CST 2016
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}