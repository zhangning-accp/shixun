package com.shixun.c18;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by zn on 2016/1/14.
 * 演示在反射里构造方法的使用
 */
public class ConstructorDemo {
    public static void main(String [] args) {
        try {
            Class clazz = Class.forName("com.shixun.c18.User");
            //User u = (User)clazz.newInstance();

            //clazz.getConstructor()
            //Class [] parTypes = {String.class,String.class};
//            Constructor [] constructors = clazz.getConstructors();
//            for(Constructor c : constructors) {
//                c.getP
//            }
            //根据参数类型列表找到对应的构造方法对象
            Constructor constructor = clazz.getConstructor(String.class,Long.TYPE);
           // Object [] values = {"zn"};
            //调用构造方法来创建一个实例。任何带参的方法在执行的时候都要传入具体的实参。
            User u = (User) constructor.newInstance("zn",3);

           // User u = new User("zn");

            System.out.println(u.getName() + "," + u.getId());

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
