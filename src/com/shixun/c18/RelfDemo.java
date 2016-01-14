package com.shixun.c18;

import java.lang.invoke.MethodHandle;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by zn on 2016/1/14
 * 演示反射的基本使用
 */
public class RelfDemo {
    /**
     *
     * @param className
     * @return 一个map集合，key就是方法名，value就是对应的method对象
     */
    public static Set<Method> getMethods(String className) {
        Set<Method> set = new HashSet();
        try {
            Class clazz = Class.forName(className);
            Method [] methods = clazz.getMethods();
            for(Method m : methods) {
                set.add(m);
            }
            methods = clazz.getDeclaredMethods();
            for(Method m : methods) {
                set.add(m);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return set;
    }
    public static Set<Method> getMethods(Object obj) {
        return getMethods(obj.getClass());
    }

    public static Set<Method> getMethods(Class clazz) {
        return getMethods(clazz.getPackage()+"." + clazz.getName());
    }
    public static void main(String [] args) {

        Set methods = getMethods(new User());
        Iterator<Method> iterator = methods.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
//        User u = new User();
//        u = new User();
//        try {
//            //加载类模版
//            Class clazz = Class.forName("com.shixun.c18.User");
//            Class [] parTypes = {String.class};
//            Constructor constructor = clazz.getConstructor(parTypes);
//            Object [] values = {"zn"};
//            User u = (User)constructor.newInstance(values);
//            System.out.println(u.getName());
//            //Method [] methods = clazz.getMethods();//获得本类及继承的所有public方法
//            Method [] methods = clazz.getDeclaredMethods();//本类里定义的所有的方法，不含继承的方法
//            for(Method m : methods) {
//                System.out.println(m);
//            }
////            Object obj = clazz.newInstance();//调用的是无参构造方法
////            obj = clazz.newInstance();
////            obj = clazz.newInstance();
////            obj = clazz.newInstance();
////
////            User u = new User();
////            //首先会加载User类模版
////            //根据User类模版生成User对象
//
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } catch (NoSuchMethodException e) {
//            e.printStackTrace();
//        } catch (InvocationTargetException e) {
//            e.printStackTrace();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        }
////        catch (InstantiationException e) {
////            e.printStackTrace();
////        } catch (IllegalAccessException e) {
////            e.printStackTrace();
        }
//    }
}
