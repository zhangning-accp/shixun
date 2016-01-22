package com.shixun.c20.c201;

/**
 * Created by zn on 2016/1/22.
 */
public class Test {
    public static void main(String [] args) {
        Storge storge = new Storge();
        for(int i = 0; i < 5; i ++) {
            if(i % 3 == 0) {
                FactoryThread factory = new FactoryThread(storge);
                factory.start();
            } else {
                CustomerThread customer = new CustomerThread(storge);
                customer.start();
            }
        }
    }
}
