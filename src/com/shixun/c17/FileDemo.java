package com.shixun.c17;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by zn on 2016/1/12.
 */
public class FileDemo {
    public static void main(String [] args) {
        //1. 创建目录
        File file = new File("e:/a/b/b");
        if(file.exists()) {
            //FileInputStream
        }
        File [] files = file.listFiles();
        for(File f : files) {
            File [] fis = f.listFiles();
            System.out.println(f.toString());
        }
        //if(file.exists()){
           //file.delete();
        //File.separator;
            //file.mkdirs();//创建目录
//            try {
//                //boolean isSuccess = file.createNewFile();//创建件
//                //System.out.println(isSuccess);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
       // }

    }
}
