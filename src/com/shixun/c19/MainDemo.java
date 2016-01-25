package com.shixun.c19;

/**
 * Created by zn on 2016/1/18.
 */
public class MainDemo {
    public static void main(String [] args) throws InterruptedException {

        FirstThread thread0 = new FirstThread();
        thread0.start();
        //thread0.join();

        Thread thread1 = new FirstThread();
        thread1.start();
        //thread1.join();

        Thread thread2 = new FirstThread();
        thread2.start();
        //thread2.join();

        Thread thread3 = new FirstThread();
        thread3.start();
        //thread3.join();

        thread0.setStop(true);

        String name = Thread.currentThread().getName();
        for(int i = 0; i < 5; i ++) {
            System.out.println("线程" + name + ",i =>" + i);
        }
    }
}
