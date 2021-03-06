package com.shixun.c20;

/**
 * Created by zn on 2016/1/22.
 */
public class OutTest extends Thread {
    private int number;
    private Object obj;
    public OutTest(int number,Object obj) {
        this.number = number;
        this.obj = obj;
    }
    public void run() {
        while(true) {
            synchronized (obj) {
                try {
                    System.out.print(number + ",");
                    Thread.sleep(500);
                    obj.notifyAll();
                    obj.wait();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
