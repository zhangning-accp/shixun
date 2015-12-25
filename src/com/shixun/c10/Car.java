package com.shixun.c10;

/**
 * Created by zn on 2015/12/25.
 * 一个汽车类
 */
public class Car{
    //颜色属性
    private String color;

    public Car() {

    }
    public Car(String color) {
        System.out.println("public Car()");
    }
    protected void run() {
        System.out.println("汽车启动了.....");
    }

}
