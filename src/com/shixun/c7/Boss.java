package com.shixun.c7;

/**
 * Created by zn on 2015/12/21.
 */
public class Boss {
    private String name;
    private int age;

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        if(age > 150){
            this.age = 150;
        } else if(age < 0) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 拿包烟
     */
    public void naYan() {
        System.out.println("拿去，10块钱");

    }
}