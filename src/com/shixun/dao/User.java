package com.shixun.dao;

import java.util.Date;

/**
 * Created by Administrator on 2016/4/8.
 * 一个代表用户的实体类
 */
public class User {
    private long id;//id
    private String userAccount;//账号
    private String userPassword;//密码
    private String userGender;//性别
    private String userEmail;//
    private String userAddress;
    private String userPhone;
    private String userCconstellation;//星座
    private String userImg;//用户头像
    private Date createDatetime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserCconstellation() {
        return userCconstellation;
    }

    public void setUserCconstellation(String userCconstellation) {
        this.userCconstellation = userCconstellation;
    }

    public String getUserImg() {
        return userImg;
    }

    public void setUserImg(String userImg) {
        this.userImg = userImg;
    }

    public Date getCreateDatetime() {
        return createDatetime;
    }

    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
    }
}
