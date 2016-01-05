package com.shixun.c16;

/**
 * Created by zn on 2016/1/5.
 */
public class StringM {
    private char [] value;
    public void setValue(String value) {
        char [] c = value.toCharArray();
        this.value = c;
    }
    public String getValue() {
        StringBuffer buffer = new StringBuffer();
        for(char c : value) {
            buffer.append(c);
        }
        return buffer.toString();
    }
}
