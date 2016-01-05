package com.shixun.stage.project;

import java.util.Date;

/**
 * Created by zn on 2016/1/5.
 * 用户使用的充值卡对象，和Card不同的是，该类具有卡生效时间
 */
public class UserCard extends Card{
    //卡的生效时间
    private Date createDate;

    //卡的购买时间
    private Date buyDate;

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getBuyDate() {
        return buyDate;
    }

    public void setBuyDate(Date buyDate) {
        this.buyDate = buyDate;
    }
}
