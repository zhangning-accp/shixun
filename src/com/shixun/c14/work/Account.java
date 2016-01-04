package com.shixun.c14.work;

/**
 * Created by zn on 2015/12/31.
 * 帐号类
 */
public class Account {
    /**
     * 帐号
     */
    private String account;
    /**
     * 帐号密码
     */
    private String password;
    /**
     * 帐号金额
     */
    private int money;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
