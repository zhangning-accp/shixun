package com.shixun.c14;

/**
 * Created by zn on 2015/12/31.
 * 用户不存在异常
 */
public class NotUserException extends Exception{
    public NotUserException() {
        super("NotUserException");
    }
    public NotUserException(String message) {
        super(message);
    }
}
