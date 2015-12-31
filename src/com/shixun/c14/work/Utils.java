package com.shixun.c14.work;

/**
 * Created by zn on 2015/12/31.
 */
public class Utils {
    /**
     * 判断一个字符是否为null或空内容
     * 示例：
     * Utils.isBlank("ok")  false
     * Utils.isBlank("")    true;
     * Utils.isBlank("    ")    true
     * Utils.isBlank(null)  true
     * Utils.isBlank("  ok  ")  false
     * Utils.isBlank("o  k")    false;
     * @param str 需要判断的字符串
     * @return 如果str为null或空值或多个空格符，否返回为true，否则返回为false
     */
    public static boolean isBlank(String str) {

    }

    /**
     * 判断传入的字符串是否为boolean
     * 部分示例：
     * Utils.isBoolean("true"); true;
     * Utils.isBoolean("false"); false;
     * Utils.isBoolean("yes"); true;
     * Utils.isBoolean("no"); false;
     * Utils.isBoolean(null); false
     * Utils.isBoolean(""); false;
     * Utils.isBoolean("    "); false;
     * Utils.isBoolean("true  "); true;
     * Utils.isBoolean("  true"); true;
     * Utils.isBoolean("  true  "); true;
     * Utils.isBoolean("abc"); false;
     * @param str
     * @return
     */
    public static boolean isBoolean(String str) {

    }

    /**
     * 判断是否是数字，包含正负数
     * @param str
     * @return
     */
    public static boolean isDigit(String str) {

    }

    /**
     * 判断是否是浮点数
     * @param str
     * @return
     */
    public static boolean isDouble(String str) {

    }

    /**
     * 判断是否是正确的电子邮件格式(选作)
     * @param str
     * @return
     */
    public static boolean isEmail(String str){

    }
}
