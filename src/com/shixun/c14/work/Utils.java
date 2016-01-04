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
        return false;
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
        return false;
    }

    /**
     * 判断是否是数字，包含正负数
     * @param str
     * @return
     */
    public static boolean isDigit(String str) {

        if(isDouble(str)) {
            return false;
        } else {
            char[] chars = str.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                char pointChar = chars[i];
                //如果存在点或非数字则返回false.但如果第一个字符是-或+是允许的
                if((pointChar == '-' || pointChar == '+') && i > 0) {
                    return false;
                } else if ((pointChar == '.' || (int) pointChar < 48 || (int) pointChar > 57)) {
                    return false;
                } else {

                }
            }
        }
        return false;
    }

    /**
     * 判断是否是浮点数
     * @param str
     * @return
     */
    public static boolean isDouble(String str) {
        //判断输入的字符串是null或空内容否
        if(!isBlank(str)) {
            char [] chars = str.toCharArray();
            int dotNumber = 0;//.计数器，浮点数只能有一个点，如果超过两个点就是错误的浮点数
            for(int i = 0; i < chars.length; i ++) {
                char pointChar = chars[i];
                if(dotNumber > 1){
                    return false;
                }
                if(pointChar == '.' && i == 0) {//先判断第一个字符是豆点直接返回false
                    return false;
                } else if(pointChar == '.' && i > 0) {
                    dotNumber++;
                } else if((int)pointChar < 48 || (int)pointChar > 57) {//如果是非0-9的数字，则返回false
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;//返回真
    }

    /**
     * 判断是否是正确的电子邮件格式(选作)
     * @param str
     * @return
     */
    public static boolean isEmail(String str){
        return false;
    }


}
