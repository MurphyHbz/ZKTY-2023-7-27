package com.mys.zkty.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class SelectOrder {
    private String userAccount;
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date minordertime;
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date maxordertime;
    private double maxorderAmount;
    private double minorderAmount;

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public Date getMinordertime() {
        return minordertime;
    }

    public void setMinordertime(Date minordertime) {
        this.minordertime = minordertime;
    }

    public Date getMaxordertime() {
        return maxordertime;
    }

    public void setMaxordertime(Date maxordertime) {
        this.maxordertime = maxordertime;
    }

    public double getMaxorderAmount() {
        return maxorderAmount;
    }

    public void setMaxorderAmount(double maxorderAmount) {
        this.maxorderAmount = maxorderAmount;
    }

    public double getMinorderAmount() {
        return minorderAmount;
    }

    public void setMinorderAmount(double minorderAmount) {
        this.minorderAmount = minorderAmount;
    }

    @Override
    public String toString() {
        return "SelectOrder{" +
                "userAccount='" + userAccount + '\'' +
                ", minordertime=" + minordertime +
                ", maxordertime=" + maxordertime +
                ", maxorderAmount=" + maxorderAmount +
                ", minorderAmount=" + minorderAmount +
                '}';
    }
}
