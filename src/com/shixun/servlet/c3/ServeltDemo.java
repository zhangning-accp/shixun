package com.shixun.servlet.c3;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/3/28.
 * 获取用户的注册数据,并根据是否重复,进行请求的跳转
 */
public class ServeltDemo extends HttpServlet {
    Map<String,String> userMap = new HashMap<>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取用户提交的数据
        String userName = req.getParameter("user_name");
        resp.setCharacterEncoding("UTF-8");
        //resp.setContentType("text/html;charset=UTF-8");
        //判断用户名是否重复，如果重复，则跳回注册页面，并给出提示。
        if(userMap.containsKey(userName)){
            //跳转1. 请求转发
//            RequestDispatcher dispatcher = req.getRequestDispatcher("/process/name.do?password=sdfadsf");
//            dispatcher.forward(req,resp);
            resp.sendRedirect("/shixun/process/name.do?password=sdfadsf&user_name=" + userName);
           // PrintWriter writer = resp.getWriter();
            //writer.write("<script>alert('名字已存在,请重新输入');location.href='index.html';</script>");

        } else {
            userMap.put(userName,"111111");
//            RequestDispatcher dispatcher = req.getRequestDispatcher("/html/c3/ok.html");
//            dispatcher.forward(req,resp);
            resp.sendRedirect("ok.html");

        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
