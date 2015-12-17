package com.shixun.c4;

/**
 * Created by zn on 2015/12/15.
 */
public class ArrayDemo {
    public static void main(String [] args) {
        int [] num1 = {1,2,3};//声明并初始化数值
        int [] num2 = new int[4];//声明一个数组并指定长度
        int [] num3 = new int[]{1,2,3};//
        int c = num1[1];
        num1[1] = 9;
        for(int i = 0; i < num2.length; i ++) {
            num2[i] = 34;
        }
    }
}
