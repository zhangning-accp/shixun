package com.shixun.c17;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/**
 * Created by zn on 2016/1/12.
 */
public class StreamDemo {
    public static void main(String [] args) {
        System.out.println("start....");
//        FileReader reader = null;
//        FileWriter writer = null;
        FileInputStream reader = null;
        FileOutputStream writer = null;
        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(
                    new FileReader("e:/nexus-copy.text"));
            //reader = new FileInputStream("e:/16年主屏一起.jpg");
            String st = "";
            while(st != null) {
                st = bufferedReader.readLine();
                System.out.println(st);
            }
//            writer = new FileOutputStream("e:/1.jpg");
//            while((reader.read(content)) != -1) {
//                writer.write(content);
//            }
            bufferedReader.close();
            //writer.close();
            System.out.println("end....");
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
