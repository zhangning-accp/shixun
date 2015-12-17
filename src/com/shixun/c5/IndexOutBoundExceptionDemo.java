package com.shixun.c5;

import java.util.Scanner;

/**
 * Created by zn on 2015/12/17.
 */
public class IndexOutBoundExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] persons = new String[3][4];
        String name = "";
        String password = "";
        String email = "";
        String age = "";
        for (int i = 0; i < persons.length; i++) {
            System.out.println("请输入用户名：");
            name = scanner.next();
            System.out.println("请输入密码：");
            password = scanner.next();
            System.out.println("请输入email：");
            email = scanner.next();
            System.out.println("请输入年龄：");
            age = scanner.next();
            persons[i][0] = name;
            persons[i][1] = password;
            persons[i][2] = email;
            persons[i][3] = age;
        }
        while (true) {
            System.out.println("输入用户名和密码进行登录操作");
            name = scanner.next();
            password = scanner.next();
            boolean isLogin = false;
            //进行登录验证
            for (int i = 0; i < persons.length; i++) {
                String[] person = persons[i];
                String oldName = person[0];
                String oldPassword = person[1];
                if (name.equals(oldName) && password.equals(oldPassword)) {
                    //System.out.println("登录成功!");
                    isLogin = true;
                }
            }
            if(isLogin){
                System.out.println("登录成功!");
            } else {
                System.out.println("用户名或密码错误，登录失败!");
            }
        }
    }
}
