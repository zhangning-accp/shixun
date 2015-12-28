package com.shixun.c10;

/**
 * Created by zn on 2015/12/25.
 * 奥拓
 */
public class AutoCar extends Car{
    public AutoCar() {
        super("green");
        System.out.println("public AutoCar()");
    }

    public void run(int a) {

    }
//    public void run() {
//        super.run();
//        System.out.println("奥拓车预热5秒");
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("预热完成，奥拓车启动了....");
//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("10秒后达到100km");
//    }
}
