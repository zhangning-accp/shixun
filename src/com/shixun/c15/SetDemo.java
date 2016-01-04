package com.shixun.c15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by zn on 2016/1/4.
 */
public class SetDemo {
    public static void main(String [] args) {
        Set set = new HashSet();
        for (int i = 0; i < 5; i++) {
            set.add("i-" + 5);
        }
        System.out.println(set);

    }
}
