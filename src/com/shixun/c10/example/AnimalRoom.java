package com.shixun.c10.example;

/**
 * Created by zn on 2015/12/25.
 */
public class AnimalRoom {
    public static void main(String [] args) {
        //随机生成3只动物
        Duck duck = null;
        Dog dog = null;
        Cat cat = null;

        for(int i = 0 ; i < 3; i ++) {
            int random = (int)(Math.random() * 3) + 1;
            switch(random) {
                case 1:
                    duck = new Duck();
                    duck.setBreed("鸭子1");
                    duck.setColor("red");
                    break;
                case 2:
                    dog = new Dog();
                    dog.setBreed("狗狗2");
                    dog.setColor("red");
                    break;
                case 3:
                    cat = new Cat();
                    cat.setBreed("小猫3");
                    cat.setColor("red");
                break;
            }
        }

        if(duck != null) {
            duck.runing();
            duck.swimming();
            duck.love();
        }
        if(cat != null) {
            cat.runing();
            cat.love();
        }
        if(dog != null) {
            dog.runing();
            dog.swimming();
            dog.love();
        }
    }
}
