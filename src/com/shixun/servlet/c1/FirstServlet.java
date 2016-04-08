package com.shixun.servlet.c1;

import javax.servlet.Servlet;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Administrator on 2016/3/24.
 */
public class FirstServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request,
                          javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.print("welcom servlet!!");
    }
}
