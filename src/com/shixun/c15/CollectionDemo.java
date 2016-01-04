package com.shixun.c15;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zn on 2016/1/4.
 * 演示集合的用法
 */
public class CollectionDemo {

    public static void main(String [] args) {
        List list = new ArrayList();
        for(int i = 0;i < 100;i++){
            list.add(i);
        }
        for(int i = 0;i < 10000000;i++){
            list.add(i);
        }
        System.out.println(list.size());
    }



}

