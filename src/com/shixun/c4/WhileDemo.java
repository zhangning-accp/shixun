package com.shixun.c4;

import java.util.Scanner;

/**
 * Created by zn on 2015/12/15.
 * 演示While的基本用法和注意事项
 */
public class WhileDemo {
    public static void main(String [] args) {
        //任务：三步验证
        String name = "abc";
        String pwd = "456";
        Scanner scanner = new Scanner(System.in);
        String userName = "";
        String password = "";
        int i = 0;//循环的条件
        while(!userName.equals(name)
                || !password.equals(pwd)
                && i < 3) {
            System.out.println("请输入用户名或密码:");
            userName = scanner.next();
            password = scanner.next();
            i ++;
        }
        if(i > 2) {
            System.out.println("超过3次输入错误，程序结束..");
        } else {
            System.out.println("输入正确...恭喜你，登录系统");
        }

    }
}
