package com.shixun.servlet.c5;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.UUID;

/**
 * Created by Administrator on 2016/3/31.
 */
public class Servelt1 extends HttpServlet {
    private String encoding = "UTF-8";


    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        encoding = config.getInitParameter("encoding");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println(encoding);
        resp.setCharacterEncoding(encoding);
        User u = new User();
        u.setName("user_" + Math.random());

        //application.setAttribute("user",u);
//        req.setAttribute("user",u);
//        req.getRequestDispatcher("s2.do").forward(req,resp);
        resp.sendRedirect("s2.do");

    }
}
