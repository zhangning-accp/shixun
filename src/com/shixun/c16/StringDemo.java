package com.shixun.c16;

/**
 * Created by zn on 2016/1/5.
 */
public class StringDemo {
    public static void main(String [] args) {

        String s = "zhangning_inadf@126.com";
        StringBuffer buffer = new StringBuffer();
        //buffer.append(b).append(b).append().append();
        int indexOf = s.indexOf("u");
        int lastIndexOf = s.lastIndexOf("a");
        String s1 = s.substring(0,9);
        System.out.println("*" + s1 + "*");
        System.out.println(indexOf);
        System.out.println(lastIndexOf);
        int index = s.trim().lastIndexOf("@");
        System.out.println(s.substring(0,index));

    }
}
