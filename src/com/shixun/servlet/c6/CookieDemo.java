package com.shixun.servlet.c6;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.UUID;

/**
 * Created by Administrator on 2016/4/1.
 */
public class CookieDemo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1. 首先检查是否有cookie内容，如果没有，则服务器生成cookie，送给客户端。如果有，则服务器直接获取，并显示
        //1. 获取cookie

        Cookie [] cookies = req.getCookies();
        if(cookies != null && cookies.length > 0) {
            //在服务器端输出cookies的内容
            for(Cookie k : cookies) {
                String name = k.getName();
                String value = k.getValue();
                String domain = k.getDomain();
                String comment = k.getComment();
                int age = k.getMaxAge();
                String path = k.getPath();
                boolean secure = k.getSecure();
                int version =  k.getVersion();
                System.out.println("name:" + name + ",value:" + value + ",domain:" + domain
                + ",comment:" + comment + ",age:" + age + ",path:" + path + ",secure:" + secure
                + ",version:" + version);
            }
        } else {//服务器生成cookie文件，输出到客户端
            System.out.println("生成cookie文件");
            Cookie cookie = new Cookie("user_id", UUID.randomUUID().toString());
            resp.addCookie(cookie);
            //String url = resp.encodeRedirectURL("/shixun/index.jsp");
            //System.out.println(url);
        }
    }
}
