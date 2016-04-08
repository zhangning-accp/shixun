package com;

/**
 * Created by Administrator on 2016/3/22.
 */
public class Ramdom {
    public static void main(String [] args) {
        for(int i = 0; i < 3; i ++) {
            int random = (int)((Math.random() * 21) + 1);
            System.out.println("index:" + random);
        }
    }
}
