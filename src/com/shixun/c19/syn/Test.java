package com.shixun.c19.syn;

/**
 * Created by zn on 2016/1/19.
 */
public class Test {
    public static void main(String [] args) {
        Data data = new Data();
        for(int i = 0; i < 5; i ++) {
            CustomerThread thread = new CustomerThread(data,i);
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
