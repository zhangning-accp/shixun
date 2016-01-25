package com.shixun.c20;

/**
 * Created by zn on 2016/1/22.
 */
public class Test {

    public static void main(String [] args) {
        Object object = new Object();
        for(int i = 0; i < 100; i ++) {
            OutTest te = new OutTest(i,object);

            try {
                te.start();
                te.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
//            try {
//                te.join();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }
}
