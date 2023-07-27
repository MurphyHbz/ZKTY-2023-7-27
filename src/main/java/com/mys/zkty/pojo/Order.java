package com.mys.zkty.pojo;

import org.springframework.context.annotation.Configuration;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
@Configuration
public class Order {

    private String userId;
    private String orderId;
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date orderTime;
    private double orderAmount;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public double getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(double orderAmount) {
        this.orderAmount = orderAmount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "userId='" + userId + '\'' +
                ", orderId='" + orderId + '\'' +
                ", orderTime=" + orderTime +
                ", orderAmount=" + orderAmount +
                '}';
    }
}
