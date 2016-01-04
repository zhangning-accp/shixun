package com.shixun.c15;

import com.shixun.c8.ObjectMethodDemo;

import java.util.ArrayList;
import java.util.*;

/**
 * Created by zn on 2016/1/4.
 */
public class ListDemo {


    public static void main(String [] args) {
        List<String> list = new LinkedList();//ArrayList是顺序存放数据

        for (int i = 0; i < 5; i++) {
           list.add(1+"");
        }

          Student st = new Student();
//        st.setName("马云");
//        st.setClassNumber("19");
        //list.set(3, st);
        System.out.println(list);

    }
}
