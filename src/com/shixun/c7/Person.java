package com.shixun.c7;

/**
 * Created by zn on 2015/12/21.
 */
public class Person {
    public String name;

    public void walk() {
        System.out.println(name + "走到小卖部,老板拿包烟");
        //让老板拿包烟
        Boss boss = new Boss();
        boss.naYan();
    }
}

