package com.shixun.c4.work1;

import java.util.Scanner;

/**
 * Created by zn on 2015/12/15.
 */
public class LevelCount {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int [] level = new int[10];
        int [] input = new int [20];
        for(int i = 0; i < input.length; i ++) {
            System.out.println("请输入第"  + (i + 1) + "次的等级");
            int lev = scanner.nextInt();
            if(lev < 1 || lev > 10) {
                System.out.println("等级只能在1~10之间，您输入的是" + lev + ",不符合要求，请重新输入");
                i --;
            } else {
                input [i] = lev;
                level[lev-1] += 1;
            }
        }
        System.out.println("等级\t出现的次数统计\n-------------------------------------------------------------------------------");
        for(int i = 0; i < level.length; i ++) {
            System.out.println((i + 1) + "\t\t" + level[i]);
        }
    }
}
