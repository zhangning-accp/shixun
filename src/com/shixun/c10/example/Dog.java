package com.shixun.c10.example;

/**
 * Created by zn on 2015/12/25.
 * 狗
 */
public class Dog extends Animal {
    /**
     * 游泳
     */
    public void swimming() {
        System.out.println(this.getColor() + "颜色" + this.getBreed() + "品种在谈游泳");
    }
}
