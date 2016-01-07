package com.shixun.stage.project;

import java.util.Date;

/**
 * Created by zn on 2016/1/5.
 * 具体卡对象
 */
public class Card {
    private long id;
    /**
     * 卡类型
     */
    private CardTypeEnum cardType;
    /**
     * 价格
     */
    private int price;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public CardTypeEnum getCardType() {
        return cardType;
    }

    public void setCardType(CardTypeEnum cardType) {
        this.cardType = cardType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
