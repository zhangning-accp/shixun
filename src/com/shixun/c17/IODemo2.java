package com.shixun.c17;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by zn on 2016/1/11.
 */
public class IODemo2 {

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        String msg  = "";
        StringBuffer buffer = new StringBuffer("");
//        while(!msg.trim().equals("exit")) {
//            System.out.println("请输入内容，如果是exit则程序退出");
//            msg = scanner.next();
//            buffer.append(msg + "\r\n");
//        }
//        try {
//            FileWriter out = new FileWriter("e:/scanner.txt");
//            out.write(buffer.toString());
//            out.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        try {
            FileReader in = new FileReader("e:/scanner.txt");
            buffer = new StringBuffer();
            char [] c = new char[1];
            int i = in.read(c);
            in.read();
            in.read();
            in.read();
            in.read();
            while(in.read(c)!= -1) {
                msg = new String(c);
                buffer.append(msg);
                i = in.read(c);
            }
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("文件内容如下：" + buffer.toString());

    }
}
