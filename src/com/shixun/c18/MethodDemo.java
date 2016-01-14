package com.shixun.c18;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by zn on 2016/1/14.
 */
public class MethodDemo {
    public static void main(String [] args) {
        try {
            //加载类模版
            Class clazz = Class.forName("com.shixun.c18.User");
            // 构建对象
            Constructor constructor = clazz.getConstructor(String.class,Long.TYPE);
            Object obj = constructor.newInstance("c18",18);
            //调用showInfo方法
            //1 找到showInfo方法对象
            Method method = clazz.getMethod("showInfo",null);
            // 2. 执行该方法
            String reObj = (String)method.invoke(obj,null);
            System.out.println(reObj);

            User user = new User("zn",18);
            String value = user.showInfo();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
