package com.shixun.c15.c151;

/**
 * Created by zn on 2016/1/4.
 */
public class ModifierDemo {
    //只能在本类访问
    private void testPrivate() {
       System.out.println("testPrivate");
    }
    //page同包都能访问
    void testPage() {
        System.out.println("testPage");
    }
    //只要是子类都能访问。不同包不是子类不能访问。
   protected void testProtected() {
        System.out.println("testProtected");
    }
    //完全公开，都能访问
    public void testPublic() {
        System.out.println("testPage");
    }

}
