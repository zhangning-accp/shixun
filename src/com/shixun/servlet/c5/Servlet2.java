package com.shixun.servlet.c5;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Administrator on 2016/3/31.
 */
public class Servlet2 extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取Servlet1里的用户对象
//        User u = (User)req.getAttribute("user");
        PrintWriter out = resp.getWriter();
        ServletContext application = this.getServletContext();
        User u = (User) application.getAttribute("user");

        out.print("id:" + u.getId() + ",name:" + u.getName());

    }
}
