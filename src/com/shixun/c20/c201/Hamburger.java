package com.shixun.c20.c201;

import java.util.UUID;

/**
 * Created by zn on 2016/1/22.
 * 汉堡
 */
public class Hamburger {
    private String uuid;
    private int size;

    public Hamburger() {
        uuid = UUID.randomUUID().toString();
        size = (int)(Math.random() * 5);
    }
    public String toString() {
        return "Hamburger[uuid:" + uuid + ",size:" + size + "]";
    }
}
