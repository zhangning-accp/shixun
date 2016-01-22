package com.shixun.c20.c201;

/**
 * Created by zn on 2016/1/22.
 */
public class FactoryThread extends Thread {
    private Storge storge;
    public FactoryThread(Storge storge) {
        this.storge = storge;
    }
    public void run() {
        while(true) {
            //synchronized (storge) {
                storge.put();
            //}
        }
    }
}
