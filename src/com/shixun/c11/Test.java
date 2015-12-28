package com.shixun.c11;

/**
 * Created by zn on 2015/12/28.
 */
public class Test {
    public static void main(String [] args) {
        IFly fly = new AutoCar();
        IFly fly1 = new Person();
        IFly fly2 = (IFly) new BMWCar();
        fly.fly();
        fly1.fly();
        fly2.fly();
    }
}
