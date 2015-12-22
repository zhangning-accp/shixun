package com.shixun.c8;

/**
 * Created by zn on 2015/12/22.
 * 演示返回类型或参数为对象的使用方式
 */
public class ObjectMethodDemo {

    public User builderUser() {
        User u = new User();
        u.setName("test");
        u.setPassword("111");
        u.setGender("男");
        System.out.println(u);
        return u;
    }

    public void modeifyUser(User u) {
        //u = new User();
       u.setGender("女");
    }

    public void modeifyUser2(User u) {
        u = new User();
        u.setGender("女");
    }
    public static void main(String [] args) {
        ObjectMethodDemo demo = new ObjectMethodDemo();
        User u =demo.builderUser();
        System.out.println(u.toString());
        demo.modeifyUser(u);
        System.out.println(u);
    }
}
