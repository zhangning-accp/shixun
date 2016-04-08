package com.shixun.servlet.c5;

import java.util.UUID;

/**
 * Created by Administrator on 2016/3/31.
 */
public class User {
    private String id = UUID.randomUUID().toString();
    private String name;
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
