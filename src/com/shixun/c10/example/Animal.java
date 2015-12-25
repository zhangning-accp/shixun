package com.shixun.c10.example;

/**
 * Created by zn on 2015/12/25.
 * 动物类
 */
public class Animal {
    private String color;
    private String breed;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void runing() {
        System.out.println(color + "颜色" + breed + "品种在跑步");
    }
    public void love() {
        System.out.println(color + "颜色" + breed + "品种在谈恋爱");
    }

    public String toString() {
        return "breed:" + breed + ",color:" + color;
    }
}
