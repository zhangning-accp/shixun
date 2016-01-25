package com.shixun.c19.syn;

/**
 * Created by zn on 2016/1/19.
 * 自定义线程
 */
public class CustomerThread extends Thread{
    private Data data;
    private int tager;


    public CustomerThread(Data data,int tager) {
        this.data = data;
        this.tager = tager;
    }
    public void run() {
//        String name = Thread.currentThread().getName();
//        switch (tager) {
//            case 0: {
            int num = data.sum();
                //System.out.println(name + "->num:" + num);
//                break;
//            }
//            case 1:{
//                data.test();
//                break;
//            }
//            case 2:{
//                data.test2();
//                break;
//            }case 3: {
//                data.test3();
//                break;
//            }
        }
//    }
}
