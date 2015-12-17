package com.shixun.c4;

import java.util.Scanner;

/**
 * Created by zn on 2015/12/15.
 * 演示do-while的示例
 */
public class DoWhileDemo {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        String userName = "";
        String password = "";
        int i = 0;//循环的条件
        do{
            System.out.println("请输入用户名或密码:");
            userName = scanner.next();
            password = scanner.next();
            i ++;
        } while(!userName.equals("123")
                || !password.equals("123") && i < 3);
        if(i > 2) {
            System.out.println("超过3次输入错误，程序结束..");
        } else {
            System.out.println("输入正确...恭喜你，登录系统");
        }
    }
}
