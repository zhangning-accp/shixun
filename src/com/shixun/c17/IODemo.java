package com.shixun.c17;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by zn on 2016/1/11.
 */
public class IODemo {
    public static void main(String [] args) {
        System.out.println("start......");
        FileReader reader = null;
        //FileInputStream reader = null;
        FileWriter writer = null;
        //FileOutputStream writer = null;
        try {
            reader = new FileReader("e:/nexus.txt");//源
            //reader = new FileInputStream("e:/nexus.txt");
            writer = new FileWriter("e:/nexus-copy.text");//目标
            //writer = new FileOutputStream("e:/nexus-copy.text");
//            int content = -1;//数据缓存区
//            while((content = reader.read()) != -1) {
//                //writer.write(content);
//                System.out.print((char)content);
//                writer.write(content);
//            }
//            File file = new File("");
//            long length = file.length();
//            char [] content = new char[(int)length/3];//数据缓存区
//            while((reader.read(content)) != -1) {//读取数据到缓存区，直到为-1结束
//                writer.write(content);//将缓存区的数据写到目标位置
//            }
            writer.close();
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("end......");
    }
}
