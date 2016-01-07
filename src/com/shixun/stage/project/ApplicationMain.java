package com.shixun.stage.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by zn on 2016/1/5.
 */
public class ApplicationMain {
    Scanner scanner = new Scanner(System.in);
    List<User> uses = new ArrayList<User>();

    private void print(String msg) {
        System.out.print(msg);
    }
    private void println(String msg) {
        System.out.println(msg);
    }
    /**
     * 注册
     */
    private void regiest(){
        System.out.println("请输入用户名或密码：");
        String name = scanner.next();
        String password = scanner.next();
        User u = new User();
    }

    /**
     * 登录
     */
    private void login() {

    }

    private void demandLogger() {
        println("输入序号进行点播");
        //DemandLogger logger
    }

    /**
     * 查看用户信息
     */
    private void findUser() {

    }

    /**
     * 查看收益
     */
    private void findEarnings(){

    }

    /**
     * 管理员设置充值卡
     */
    private void setCard() {

    }

    /**
     * 用户购买充值卡
     */
    private  void buyUserCard() {

    }

    /**
        管理员
     */
    private void admin() {

        println("1. 登录  2.查看用户  3. 禁用用户 4.上传媒体  5.查看平台收益  6.添加充值卡  7.修改密码");
        println("欢迎您，管理员!请输入下面的序号进行相关的功能操作");
    }

    /**
     * 普通用户
     */
    private void plainUser() {
        println("1. 登录  2.注册");
        String select = scanner.next();
        while(!Utils.isDigit(select)) {
            println("您输入的不是数字，请重新输入");
            select = scanner.next();
        }
        switch (select) {
            case "1":
                //登录
                break;
            case "2":
                //注册
                break;
            default:
                println("您输入的选项无法识别，请重新输入");
                break;
        }
        println("1. 购买/升级充值卡  2.充值卡管理  3.点播项目  4.搜索项目  5.查看点播记录");

    }

    private void run() {
        //String runMenu = "请选择用户角色:  1. 管理员  2.普通用户";
        println("请选择用户角色:  1. 管理员  2.普通用户");
        String select = scanner.next();
        while(!Utils.isDigit(select)) {
            println("您输入的不是数字，请重新输入");
            select = scanner.next();
        }
        switch (select) {
            case "1":
                //管理员
                break;
            case "2":
                //普通用户
                break;
            default:
                println("您输入的选项无法识别，请重新输入");
                break;
        }

    }
    public static void main(String [] args) {
        ApplicationMain main = new ApplicationMain();
        while(true) {
            main.run();
        }
    }
}
