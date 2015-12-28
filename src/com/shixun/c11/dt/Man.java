package com.shixun.c11.dt;

import com.shixun.c10.*;

/**
 * Created by zn on 2015/12/28.
 * 男人类
 */
public class Man extends Person{
    private  String name = "man";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public void manTest() {
    }

    public void shout() {
        System.out.println("Man shout() man->name:" + name);
    }
}
