package com.shixun.servlet.c2;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Administrator on 2016/3/25.
 * 该类主要演示Servlet的生命周期
 */
public class MyServlet extends HttpServlet{
    public MyServlet(){
        System.out.println("MyServlet()");
    }
    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("init()");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        System.out.println("init(ServletConfig config)");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //req.getPar
        System.out.println("doGet");
        PrintWriter out = resp.getWriter();
        out.print(Math.random() * 8888888);
    }
}
