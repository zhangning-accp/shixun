package com.shixun.servlet.chat.biz.ext;

import com.shixun.servlet.chat.biz.*;

import java.util.UUID;

/**
 * Created by Administrator on 2016/3/31.
 */
public class User {
    private String id = UUID.randomUUID().toString();
    private String name = (int)(Math.random() * Integer.MAX_VALUE) + "";
    private Message msg = null;
    public String getId() {
        return id;
    }


    public String getName() {
        return name;
    }

}
