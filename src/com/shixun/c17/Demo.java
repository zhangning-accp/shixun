package com.shixun.c17;

import com.shixun.stage.project.User;
import com.shixun.stage.project.UserCard;

/**
 * Created by zn on 2016/1/12.
 */
public class Demo {

    public static void main(String [] args) {
        String str = "[姓名-性别-年龄-email-address]#[\"account-password-money-type\",\"\"]#[\"时间-点播的项\",\"时间-点播项\"]";
        String []datas = str.split("#");

        User user = new User();
        String [] userInfo = datas[0].split("-");
        user.setName(userInfo[0]);
        user.setAddress(userInfo[4]);
        user.setEmail(userInfo[3]);

        UserCard card = null;
        String cards = datas[1];
        String [] cardss = cards.split(",");
        for(String s : cardss) {
            String [] tmp = s.split("-");
            card = new UserCard();
            //card.setId(tmp[0]);
            //card.setCardType(tmp[3]);
        }

        //user.addUserCard();

    }
}
