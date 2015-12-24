package com.shixun.c9;

import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;

/**
 * Created by zn on 2015/12/24.
 * 演示构造方法的使用和作用
 */
public class ConstructDemo {
    static String name;//默认值为null
    int age;//默认值为0
    static {
        System.out.println("ConstructDemo");
        name = "dd";
        getName();
    }
    public static String getName() {
        ConstructDemo demo = new ConstructDemo();
        return demo.name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private void showValue() {

        System.out.println("name:" + name + ", age:" + age);
    }


    public static void main(String [] args) {

        ConstructDemo demo = new ConstructDemo();
        ConstructDemo demo1 = new ConstructDemo();

        demo.setName("tt");
        demo.setAge(2);
        demo.showValue();

        demo1.setName("ttt");
        demo1.setAge(22);

        demo.showValue();
        demo1.showValue();

    }
}
