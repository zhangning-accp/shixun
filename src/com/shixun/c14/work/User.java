package com.shixun.c14.work;

import java.util.Arrays;

/**
 * Created by zn on 2015/12/31.
 * 用户类
 */
public class User {
    //用户姓名
    private String name;
    //身份证
    private String idCard;
    //家庭地址
    private String address;
    //电话号码
    private String phone;
    //电子邮件
    private String email;
    //充值卡集合
    private ZNList accounts = new ZNList();

    private int point = 0;//一个在数组里移动的指针，用于确定当前数组可添加元素的位置

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ZNList getAccounts() {
        return accounts;
    }

    /**
     * 添加充值卡,这里单独提供一个add方法，主要是便于使用。对于方法的调用则来说，
     * 它只关心将充值卡添加到User对象即可，而无需关心是怎么加以及用什么加。
     * @param account
     */
    public void addAccount(Account account) {
        accounts.add(account);
    }
}
