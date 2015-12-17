package com.cn.demand;

import java.util.Scanner;

/**
 * Created by zn on 2015/12/14.
 * //实现单用户的点播扣费，充值等
 */
public class SimpleDemand {
    public static void main(String [] args) throws InterruptedException {
        String [] items = {"穹顶之下","泰囧","港囧","格林","危机边缘","闪电侠","神盾局",
                "神奇四侠1","神奇四侠2","新神奇四侠","代号47","蚁人","机械姬","末日崩塌","木星上行",
                "星际旅行","地球百子","暗物质","星战前传","突袭2","突袭","杀破狼","杀破狼2"};
        Scanner scanner = new Scanner(System.in);
        String menu = "1.登录    2.查询余额    3.修改密码    4.充值    5.点播    6.退出     7.查看点播日志(扩展)";
        String userName;//用户名
        String userPassword;//用户密码
        int boMoney = 10;//用户账户总金额
        String itemName;//点播的项目名
        int price;//单次点播金额
        int select = 0;//菜单选项
        boolean isLogin = false;
        System.out.print("注册即送10元Bo币!");
        System.out.println("请输入账户名:");
        userName = scanner.next();
        System.out.println("请输入密码:");
        userPassword = scanner.next();
        System.out.print("您注册的用户名为：" + userName + ",密码为：" + userPassword);
        while(true) {
            if(!isLogin){
                String newName = "";
                String newPassword = "";
                int i = 0;
                for(i = 0; i < 3; i ++) {
                    if(!userName.equals(newName)
                            || !userPassword.equals(newPassword)) {
                        System.out.println("请输入用户名和密码进行登录");
                        newName = scanner.next();
                        newPassword = scanner.next();
                    } else {
                        isLogin = true;
                        System.out.print("系统开始登录");
                        for(int j = 0; j < 10; j ++) {
                            Thread.sleep(100);
                            System.out.print("∷");
                        }
                        System.out.println("登录成功!账户Bo币:" + boMoney);
                        break;
                    }
                }
                if(i >= 3) {
                    System.out.println("超过3次输入错误，程序结束..");
                    isLogin = false;
                }
            } else {
                System.out.println("请按照菜单选择对应的功能使用");
                System.out.println(menu);
                select = scanner.nextInt();
                switch (select) {
                    case 1:
                        isLogin = false;
                        break;
                    case 2:
                        System.out.println("您帐上的余额为:" + boMoney);
                        break;
                    case 3:
                        System.out.println("请输入原密码：");
                        String oldPassword = scanner.next();
                        //判断密码是否正确，只有3次机会
                        System.out.println("请输入新密码两次，每次输完后回车");
                        String newPassword1 = scanner.next();
                        String newPassword2 = scanner.next();
                        while(!newPassword1.equals(newPassword2) || !userPassword.equals(oldPassword)) {
                            System.out.println("两次密码不一致,或原密码错误，请重新输入");
                            System.out.println("请输入原密码：");
                            oldPassword = scanner.next();
                            //判断密码是否正确，只有3次机会
                            System.out.println("请输入新密码两次，每次输完后回车");
                            newPassword1 = scanner.next();
                            newPassword2 = scanner.next();
                        }
                        userPassword = newPassword1;
                        isLogin = false;
                        break;
                    case 4:
                        System.out.println("请输入要充值的金额:");
                        int money = scanner.nextInt();
                        System.out.println("确定要充值" + money + "到Bo币吗?yes/no");
                        String yes = scanner.next();
                        if (yes.trim().equals("yes")) {
                            boMoney += money;
                            System.out.println("您此次充值" + money + "成功！账户Bo币为:" + boMoney);
                        } else {
                            System.out.println("您取消了Bo币充值，账户Bo币为:" + boMoney);
                        }
                        break;
                    case 5:
                        System.out.print("系统正在将为您选择点播内容，请稍候");
                        int random = (int) ((Math.random() * items.length) + 1);
                        itemName = items[random];
                        int itemMoney = (int) ((Math.random() * random) + 1);
                        if (boMoney < itemMoney) {
                            System.out.println("您点播的内容需要支付" + itemMoney + "您账户上的Bo币只有" + boMoney + ",请充值..");
                            break;
                        } else if (itemMoney == 0) {
                            System.out.println("恭喜你，你选的点播项属于免费项目..");
                        } else {
                            boMoney -= itemMoney;
                        }
                        System.out.println("您点播的内容是:" + itemName + ",消费为：" + itemMoney + ",账户Bo币剩余为：" + boMoney);
                        break;
                    case 6:
                        System.out.println("退出系统");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("输入的菜单项不存在，请重新选择");
                        break;
                }
            }
        }
    }
}
