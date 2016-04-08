package com.shixun.servlet.c3;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Administrator on 2016/3/29.
 * 用户名重复时处理的Servelt
 */
public class ProcessUserNameServelt extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1. 获取用户名
        String userName = req.getParameter("user_name");
        String password = req.getParameter("password");
        resp.setCharacterEncoding("UTF-8");
        int random = (int)(Math.random() * 89893);
        userName += random;
        PrintWriter out = resp.getWriter();
        out.print("<script>alert('user-name:" +  userName + ",password=" + password +"');location.href='/shixun/html/c3/ok.html'</script>");
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       this.doPost(req,resp);
    }

}
