package com.shixun.stage.project;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * Created by zn on 2016/1/5.
 * 用户对象
 */
public class User {
    //用户id
    private long id;
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

    private Item currentItem;//当前用户点播的内容对象

    /**
     * 当前用户使用的充值卡
     */
    private UserCard currentCard = null;

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

    public List<UserCard> getCards() {
        return cards;
    }


    /**
     * 添加充值卡,这里单独提供一个add方法，主要是便于使用。对于方法的调用者来说，
     * 它只关心将充值卡添加到User对象即可，而无需关心是怎么加以及用什么加。
     * @param card
     */
    public void addUserCard(UserCard card) {
        cards.add(card);
    }

    public List<DemandLogger> getDemandLoggers() {
        return demandLoggers;
    }

    public void addDemandLogger(DemandLogger logger) {
        demandLoggers.add(logger);
        marshalLogger(logger.getUserCard().getCardType());

    }

//    private List<DemandLogger> findLoggersByCardType(CardTypeEnum type) {
//        List<DemandLogger> list = new ArrayList();
//        for (DemandLogger logger : this.demandLoggers) {
//            if (logger.getUserCard().getCardType() == type) {
//                list.add(logger);
//            }
//        }
//        return list;
//    }

    /**
     * 根据指定的卡类型整理日志，将多余的日志内容删除
     * @param type
     */
    private void marshalLogger(CardTypeEnum type) {
//        List<DemandLogger> list = findLoggersByCardType(type);
        List<DemandLogger> list = new ArrayList();
        for (DemandLogger logger : this.demandLoggers) {
            if (logger.getUserCard().getCardType() == type) {
                list.add(logger);
            }
        }
        DemandLogger lastLogger = list.get(list.size() - 1);//获取最后一条此类型的日志记录对象
        long createTime = lastLogger.getCreateDatetime().getTime();
        Iterator<DemandLogger> iterator = list.iterator();
        long firstTime = 0;//起始时间
        switch (type) {
            case MONTH_CARD://月卡,只保留15天以内的记录
                firstTime = createTime - (60 * 60 * 24 * 1000* 15);
                break;
            case QUARTER_CARD://季度卡，只保留1个月内的记录
                firstTime = createTime - (60 * 60 * 24 * 1000* 30);
                break;
            case YEAR_CARD://年卡，只保留6个月的记录
                firstTime = createTime - (60 * 60 * 24 * 1000 * 30 * 6);
                break;
            case HALF_A_YEAR_CARD://半年卡，只保留3个月的记录
                firstTime = createTime - (60 * 60 * 24 * 1000* 30 * 3);
                break;
        }
        while(iterator.hasNext()) {
            DemandLogger logger = iterator.next();
            //如果当前的日志对象小于对应类型计算出的开始保留的日志时间，则删除此条日志
            if(logger.getCreateDatetime().getTime() < firstTime) {
                iterator.remove();
            }
        }
    }
}
