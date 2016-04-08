package com.shixun.servlet.chat.biz;

import java.util.Random;
import java.util.UUID;

/**
 * Created by Administrator on 2016/3/31.
 */
public class User {
    private String id = UUID.randomUUID().toString();
    private String name = (int)(Math.random() * Integer.MAX_VALUE) + "";

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
