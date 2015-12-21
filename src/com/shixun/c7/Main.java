package com.shixun.c7;

/**
 * Created by zn on 2015/12/21.
 */
public class Main {

    public static void main(String [] args) {
        XiaoMaiBu b1 = new XiaoMaiBu();
        Boss boss1 = new Boss();
        boss1.setName("zz");
        b1.setBoss(boss1);
        XiaoMaiBu b2 = new XiaoMaiBu();
        Boss boss2 = new Boss();
        boss1.setName("dd");
        b2.setBoss(boss2);

        if(b1.getBoss().getName().equals(b2.getBoss().getName())) {

        }

    }
}

