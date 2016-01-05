package com.shixun.stage.project;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zn on 2016/1/5.
 */
public class User {
    //用户id
    private String id;
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
    private List<UserCard> cards = new ArrayList<UserCard>();
    //点播日志(消费日志)
    private List<DemandLogger> demandLoggers = new ArrayList<DemandLogger>();

    /**
     * 当前用户使用的充值卡
     */
    private UserCard currentCard = null;


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

    public List<UserCard> getAccounts() {
        return cards;
    }

    /**
     * 添加充值卡,这里单独提供一个add方法，主要是便于使用。对于方法的调用者来说，
     * 它只关心将充值卡添加到User对象即可，而无需关心是怎么加以及用什么加。
     * @param card
     */
    public void addAccount(UserCard card) {
        cards.add(card);
    }


    public List<DemandLogger> getDemandLogger() {
        return demandLoggers;
    }
    public void addDemandLogger(DemandLogger logger) {
        //这里需要根据充值卡类型，按要求，保留对应的日志数据。所以不仅仅是简单的放入集合。需要将过期日志清除。
        demandLoggers.add(logger);
    }
}
