package com.shixun.c18;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by zn on 2016/1/14.
 * 演示通过反射对域进行操作
 */
public class FieldDemo {
    public static void main(String [] args) {
        try {
            //加载类模版
            Class clazz = Class.forName("com.shixun.c18.User");
            Object obj = clazz.newInstance();
            //同样class也提供获取多个域的方法,具体返回的field同method里的含义
            clazz.getFields();
            clazz.getDeclaredFields();
            //获取email域对象
            //clazz.getField("email");//只能获得public的域，非public的会抛异常
            Field field = clazz.getDeclaredField("email");
            field.setAccessible(true);//设置域访问权限，这里表示可以访问private
            //设置值，也可以使用Method方法完成同样的操作
            field.set(obj,"zhangning.holley@gmail.com");
            System.out.println(field.get(obj));

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
