package com.shixun.c16;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by zn on 2016/1/5.
 */
public class DateDemo {
    public static void main(String [] args) {
//        Date date = new Date();
//        date.setTime(System.currentTimeMillis());
//        Date date1 = new Date(System.currentTimeMillis());
        Calendar calendar = new GregorianCalendar();

        //一年的第几天
        int dayOfYear = calendar.get(Calendar.DAY_OF_YEAR);
        System.out.println("一年的第" + dayOfYear + "天") ;
        //一月的第几天
        //一周的第几天
        Calendar calendar2018 = Calendar.getInstance();
        calendar2018.set(Calendar.YEAR,2018);
        //计算离2018年差多少天，多少月，多少时，多少分，多少秒
        long current = calendar.getTimeInMillis();
        long c2018 = calendar2018.getTimeInMillis();
        int day = (int) ((c2018 - current) / (60 * 60 * 24 * 1000));

        System.out.println(day);
        //System.out.println(date1.toLocaleString());
        //日期格式化类
        SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒SSS毫秒");
        Date date = new Date();
        String dateStr = format.format(new Date());
        System.out.println(dateStr);
        System.out.println(date.toString());
        try {
            Date date1 = format.parse("2016年1月05日 0时0分0秒0毫秒");
            System.out.println(date1.toLocaleString());
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
