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

    public static void main(String [] args) {
        ApplicationMain main = new ApplicationMain();
        while(true) {
            main.regiest();

            Page<DemandLogger> page = new Page();
            List<DemandLogger> list = new ArrayList<DemandLogger>();
            page.setDatas(list);
            page.next();
            List<DemandLogger> pageDatas = page.getPageDatas();

        }
    }
}
