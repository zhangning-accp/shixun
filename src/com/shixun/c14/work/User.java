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
    private Account [] accounts = new Account[2];

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

    public Account[] getAccounts() {
        return accounts;
    }

    /**
     * 添加充值卡
     * @param account
     */
    public void addAccount(Account account) {
        if(point <= accounts.length -1) {
            accounts[point] = account;
            point ++;
        } else {
            //如果当前的point点位于最后的位置，表示数组已满，此时需要扩充数组长度，扩充按原长度+原长度/2
            Account [] tmp = accounts;
            accounts = new Account[accounts.length + (accounts.length / 2)];
            for(int i = 0; i < tmp.length; i ++) {
                accounts[i] = tmp[i];
                point = i + 1;
            }
        }
    }

}
