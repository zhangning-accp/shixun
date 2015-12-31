package com.shixun.c14;

import com.shixun.c13.v3.Spirit;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.AtomicMoveNotSupportedException;
import java.util.Scanner;

/**
 * Created by zn on 2015/12/31.
 */
public class ExceptionDemo {
    Scanner scanner = new Scanner(System.in);

    public void test() {
        String age = scanner.next();
        while(!isNumber(age)) {
            age = scanner.next();
        }
    }

    public static void test2() throws NotUserException {
        throw new NotUserException("出大事了！！！");
    }

    private boolean isNumber(String number) {
        char [] chars = number.toCharArray();
        boolean isNumber = false;
        for(int i = 0; i < chars.length; i ++) {
            if(chars[i] > '0' && chars[i] <= '9') {
                isNumber = true;
            } else {
                isNumber = false;
                break;
            }
        }
        return isNumber;
    }

    public static void main(String [] args) {
        try {
            test2();
        } catch (NotUserException e) {
            e.printStackTrace();
        }
        System.out.println("程序结束");
    }
}

