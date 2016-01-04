package com.shixun.c15;

import com.shixun.c15.c151.ModifierDemo;

/**
 * Created by zn on 2016/1/4.
 */
public class Test extends ModifierDemo {

    public static void main(String [] args) {
        Test test = new Test();
        test.testProtected();
        ModifierDemo demo = new ModifierDemo();
        demo.testPublic();
    }
}
