package com.shixun.c17;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by zn on 2016/1/12.
 */
public class RandomAccessFileDemo {
    public static void main(String [] args) {
        RandomAccessFile accessFile = null;
        File file = new File("log.txt");
        try {
            accessFile = new RandomAccessFile(file,"rw");
            accessFile.seek(file.length());
            accessFile.write("accessFile\r\n".getBytes("UTF-8"));
            accessFile.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
