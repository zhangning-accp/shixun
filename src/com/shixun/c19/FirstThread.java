package com.shixun.c19;

/**
 * Created by zn on 2016/1/18.
 */
public class FirstThread extends Thread{
    private  boolean isStop = false;

    public synchronized boolean isStop() {
        return isStop;
    }

    public synchronized void setStop(boolean isStop) {
        this.isStop = isStop;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        for(int i = 0; i < 5; i ++) {
            if(isStop()) {
              //  while(true) {
                    System.out.println("线程" + name + ",i =>" + i);
                //}

            }
//            try {
//                Thread.sleep(1000);
                Thread.yield();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }
}
