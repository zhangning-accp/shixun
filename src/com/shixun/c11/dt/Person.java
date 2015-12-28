package com.shixun.c11.dt;

/**
 * Created by zn on 2015/12/28.
 * 人类
 */
public class Person {
    private String name = "Person";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.shout();
        this.name = name;
        this.shout();
    }

    public void shout() {
        System.out.println("Person shout() person->name:" + name);
    }
}
