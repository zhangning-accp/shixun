package com.shixun.c14.work;

/**
 * Created by zn on 2015/12/31.
 * 点播项对象每个Item都是一个点播项
 */
public class Item {
    //项目名
    private String name;
    //价格
    private int price;
    //内容简介
    private String content;
    //创建日期
    private String datatime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDatatime() {
        return datatime;
    }

    public void setDatatime(String datatime) {
        this.datatime = datatime;
    }
}
