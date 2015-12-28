package com.shixun.c11.dt;

/**
 * Created by zn on 2015/12/28.
 */
public class Test {
    public static void test(Person person) {
        person.shout();
    }
    public static void  main(String [] args) {
//        Person p = new Man();//向上
//
//        Woman p2 = (Woman) new Person();
//        Person p3 = new Man();
//
//        Man m = (Man) p3;//向下
//        Man m1 = (Man) p2;//向下

        //java里具体的类型指向取决于new 的实例类型
       Man man = new Man();
        man.setName("man");
        Woman woman  = new Woman();
        woman.setName("woman");
        Person p = new Person();
        p.setName("Person");
        Person p1 = new Man();
        p1.setName("p1");

        test(man);
        test(woman);
        test(p);
        test(p1);



    }
}
