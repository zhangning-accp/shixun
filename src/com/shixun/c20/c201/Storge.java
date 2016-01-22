package com.shixun.c20.c201;

import java.util.LinkedList;

/**
 * Created by zn on 2016/1/22.
 * 仓库类，放置汉堡
 */
public class Storge {
    private LinkedList<Hamburger> list = new LinkedList();
    /**
     * 从仓库里取出汉堡
     * @return
     */
    public void pop() {
        synchronized (list) {
            if (list.size() < 5) {
                System.out.println("仓库货物不足，请暂停消费.....");
                try {
                    list.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if(list.size() >= 5) {
                    Hamburger hamburger = list.removeFirst();

                    System.out.println("消费了一个汉堡：" + hamburger + ",仓库还剩" + list.size() + "个汉堡");
            }
            list.notifyAll();

        }
    }
    /**
     * 添加汉堡
     */
    public void put() {
        synchronized (list) {
            if (list.size() >= 10) {
                System.out.println("仓库已满，请暂停生产.....");
                try {
                    list.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            Hamburger hamburger = new Hamburger();
            list.add(hamburger);
            System.out.println("生产了一个汉堡:" + hamburger + ",仓库里还剩" + list.size() + "个汉堡");
            list.notifyAll();
        }
    }
}
