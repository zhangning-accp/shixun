package com.shixun.c17;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
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
        if(file.isDirectory()) {
            File [] files = file.listFiles();
           for(File f : files) {
               delete(f);//调用自身
           }
        }
        file.delete();//删除当前file对象
    }

    /**
     * 比较两个文件是否完全一样(文本文件)
     * @param file1 文件1
     * @param file2 文件2
     * 比较两个文件是否一致，，一致性的判断只做文件内容判断即可。
     *              true：一致，false：不一致
     */
    public static boolean compare(File file1, File file2) {
        //判断文件1和文件2是否存在，如果都存在才进行操作，否则返回false
        if(file1.exists() && file2.exists()) {
            BufferedReader reader1 = null;
            BufferedReader reader2 = null;
            try {
                reader1 = new BufferedReader(new FileReader(file1));
                reader2 = new BufferedReader(new FileReader(file2));
                StringBuffer buffer1 = new StringBuffer();
                StringBuffer buffer2 = new StringBuffer();
                String s1 = "";
                while(s1 != null) {
                    s1 = reader1.readLine();
                    buffer1.append(s1);
                }//文件1内容读取完毕
                s1 = "";
                while(s1 != null) {
                    s1 = reader2.readLine();
                    buffer2.append(s1);
                }//文件2内容读取完毕
                if(buffer1.toString().equals(buffer2.toString())) {
                    return true;
                } else {
                    return false;
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                return false;
            } catch (IOException e) {
                e.printStackTrace();
                return false;
            } finally {
                try {
                    if(reader1 != null) {
                        reader1.close();
                    }
                    if(reader2 != null) {
                        reader2.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } else {
            return false;
        }
    }

    /**
     * 统计源代码行数
     * @param file 需要统计的file对象
     * @return
     * 如果file是一个文件，则返回该文件里源代码的行数(含注释，换行等)
     * 如果file是一个目录，则统计该目录下所有文件的源码行数(目录下的子目录不处理)
     */
    public static long count(File file) {
        long count = 0;
        if(file.isFile()) {
            count =  countFileNumber(file);
        } else {
            File [] files = file.listFiles();
            for(File f : files) {
                if(f.isFile()) {
                    long c = countFileNumber(f);
                    count += c;
                }
            }
        }
        return count;
    }
    private static long countFileNumber(File file) {
        long count = 0;
        if(file.exists()) {
            BufferedReader reader1 = null;
            try {
                reader1 = new BufferedReader(new FileReader(file));
                String s1 = "";
                while(reader1.readLine() != null) {
                    count ++;
                }
                return count;
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                return -1;
            } catch (IOException e) {
                e.printStackTrace();
                return -1;
            } finally {
                try {
                    if(reader1 != null) {
                        reader1.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } else {
            return -1;
        }
    }

    /**
     * 统计指定文件里单个字符出现的次数。如中(28),a（36）
     * @param file 需要统计的file对象
     * @return 返回一个map集合，该集合的key就是字符，value就是字符出现的数量
     */
    public static Map<Character,Integer> countChar(File file) {
        Map<Character,Integer> map = new HashMap();
        if (file.exists()) {
            if (file.isDirectory()) {
                throw new IllegalArgumentException("file类型错误，传入的file不是一个文件，而是一个目录");
            }
            BufferedReader reader1 = null;
            try {
                reader1 = new BufferedReader(new FileReader(file));
                StringBuffer buffer1 = new StringBuffer();
                String s1 = "";
                while (s1 != null) {
                    s1 = reader1.readLine();
                    buffer1.append(s1);
                }
                s1 = buffer1.toString();
                char [] chars = s1.toCharArray();//获取char数组
                for(char c : chars) {
                    if(map.containsKey(c)) {//查看map集合里是否存在此字符记录
                        int count = map.get(c);//取出此字符记录的count值
                        count ++;
                        map.put(c,count);//更新count值
                    }
                }
                return map;
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                return null;
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            } finally {
                try {
                    if (reader1 != null) {
                        reader1.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } else {
            return null;
        }
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
        //表示desc是一个目录
        if(desc.getName().lastIndexOf(".") == -1) {
            desc.mkdirs();
        }
        if(src.isDirectory() && desc.isFile()) {
            throw new IllegalArgumentException("src是一个目录，但desc是一个文件，参数错误");
        } else {
            if(src.exists()) {
                if (src.isDirectory() && desc.isDirectory()) {
                    File [] files = src.listFiles();
                    for(File f : files) {
                        if(f.isDirectory()) {//如果是目录，则在desc下创建一个目录
                            File file = new File(desc.getAbsoluteFile() + "/" + f.getName());
                            file.mkdirs();
                            copy(f,file);//调用自身，递归的使用
                        } else {
                        //表示当前file不是目录，则直接拷贝到desc，但由于使用的递归，所以这里的desc可能不是最初传入的
                            //路径，而是在for里递归调用时传入的路径。
                            copy(f,desc);//调用自身，递归的使用
                        }
                    }
                } else if (src.isFile() && desc.isFile()) {
                    //文件对文件，覆盖或创建desc文件
                    copySampleFile(src,desc);
                } else if (src.isFile() && desc.isDirectory()) {
                    //直接把文件拷贝到desc目录下
                    copySampleFile(src,new File(desc.getAbsoluteFile() + "/" + src.getName()));
                }
            }
        }
    }

    private static void copySampleFile(File src, File desc) {
        InputStream in = null;
        OutputStream out = null;
        try {
            in = new FileInputStream(src);
            out = new FileOutputStream(desc);
            int context = -1;
            while((context = in.read()) != -1) {
                out.write(context);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(in != null) {
                    in.close();
                }
                if(out != null) {
                    out.close();
                }
            } catch(IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String [] args) {
        File src = new File("E:/a");
        File desc = new File("E:/b");
        copy(src,desc);
        delete(desc);
        System.out.println(src.getName());
        System.out.println("end...");
    }
}
