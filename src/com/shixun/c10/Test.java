package com.shixun.c10;

/**
 * Created by zn on 2015/12/25.
 */
public class Test {
    public static void main(String [] args) {
        Car car = new Car();
        car.run();
        AutoCar autoCar = new AutoCar();
        autoCar.run();
        BMWCar bmw = new BMWCar();
        bmw.run();
    }
}
