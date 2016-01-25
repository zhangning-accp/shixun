package com.shixun.c19.syn;

/**
 * Created by zn on 2016/1/19.
 * 演示用的数据类
 * 该类是线程非安全类
 */
public class Data {
    private int sum = 0;
    private int [] numbers = {1,2,3,4,5};

    public int sum() {
//        synchronized (Data.class) {
//            String name = Thread.currentThread().getName();
//            System.out.println(name + "=>sum");
            sum = 0;
            for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i];
//                try {
//                    System.out.println(name + "正在休眠");
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
        }

        return sum;
    }

//    public  synchronized void test2() {
//       //synchronized (obj) {
//            String name = Thread.currentThread().getName();
//            for (int i = 0; i < 3; i++) {
//                System.out.println(name + "=>test2: i=" + i);
//            }
//        //}
//
//    }
//
//    public synchronized void test() {
//        String name = Thread.currentThread().getName();
//        //synchronized (obj) {
//            for (int i = 0; i < 3; i++) {
//                System.out.println(name + "=>test: i=" + i);
//                try {
//                    System.out.println(name + "正在休眠");
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//           // }
//        }
//    }
//    public void test3() {
//        String name = Thread.currentThread().getName();
//        for(int i = 0; i < 3; i ++) {
//            System.out.println(name + "=>test3: i=" + i);
//            try {
//                System.out.println(name + "正在休眠");
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }


}
