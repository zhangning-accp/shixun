package com.shixun.c17;

import java.io.File;
import java.util.Map;

/**
 * Created by zn on 2016/1/12.
 * 实现所有的方法，要求程序要健壮，有相关的错误判断和处理。
 */
public class FileUtils {
    /**
     * 删除指定的File
     * @param file
     * 如果file指向的是一个目录，则需要删除该目录。需要使用递归。
     * 如果不是目录，是单个文件，则直接删除
     *
     */
    public static void delete(File file) {
        //1. 判断file是否是目录，如果是则需要进行该目录下是否还有子目录的遍历，直到不是目录，然后进行删除

    }

    /**
     * 比较两个文件是否完全一样(文本文件)
     * @param file1 文件1
     * @param file2 文件2
     * 比较两个文件是否一致，，一致性的判断只做文件内容判断即可。
     *              true：一致，false：不一致
     */
    public static boolean compare(File file1, File file2) {
        return false;
    }

    /**
     * 统计源代码行数
     * @param file 需要统计的file对象
     * @return
     * 如果file是一个文件，则返回该文件里源代码的行数(含注释，换行等)
     * 如果file是一个目录，则统计该目录下所有文件的源码行数(目录下的子目录不处理)
     */
    public static long count(File file) {
        return 0;
    }

    /**
     * 统计指定文件里单个字符出现的次数。如中(28),a（36）
     * @param file 需要统计的file对象
     * @return 返回一个map集合，该集合的key就是字符，value就是字符出现的数量
     */
    public static Map<String,Integer> countChar(File file) {
        return null;
    }

    /**
     * 拷贝文件或目录到目标
     * @param src 源
     * @param desc 目标
     * 如果传入的src是文件，则将src拷贝到指定的desc
     *             如果src是目录，则将该目录下的所有内容都拷贝到desc下
     * desc可能是一个文件也可能是一个目录，所以在处理时需要判断
     *             当src是文件时，desc可以是文件也可以是目录。
     *             当src是目录是，desc不可以是文件，只能是目录，如果是目录，就需要抛出异常或自定义异常
     */
    public static void copy(File src, File desc) {

    }

}
