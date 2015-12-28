package com.shixun.c11;

/**
 * Created by zn on 2015/12/25.
 * 一个汽车类
 */
public abstract class Car{
    //颜色属性
    private String color;

    public Car() {

    }
    public Car(String color) {
        System.out.println("public Car()");
    }

    protected abstract void run();

}
