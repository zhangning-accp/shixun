package com.shixun.c17;

import java.io.File;
import java.io.FileReader;
import java.util.Date;

/**
 * Created by zn on 2016/1/12.
 * 随堂练习：
 使用BufferedReader读写昨天的日程文件。
 在读之前，请File给出文件信息：
 1. 文件路径
 2. 文件名
 3. 文件的父目录
 4. 文件大小
 5. 文件最后一次修改的时间
 当读取完毕后，将文件删除。但删除前，请做备份
 时间30分钟
 */
public class Answer {
    public static void main(String [] args) {
        File file = new File("log.txt");
        System.out.println("文件路径：" + file.getAbsolutePath());
        System.out.println("文件名：" + file.getName());
        System.out.println("文件父目录：" + file.getParent());
        System.out.println("文件大小：" + file.length() + "字节");
        System.out.println("文件最后一次修改时间：" + new Date(file.lastModified()).toLocaleString());


        file.delete();

    }
}
