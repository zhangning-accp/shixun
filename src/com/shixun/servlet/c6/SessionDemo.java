package com.shixun.servlet.c6;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.util.UUID;

/**
 * Created by Administrator on 2016/4/1.
 */
public class SessionDemo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        HttpSession session = req.getSession(false);
        //session.setMaxInactiveInterval(10);
        if(session == null) {
            //跳转到登陆界面;
            out.print("papapa!!");
        } else {
            out.println(session);
        }
        //String str = "sessionid:" + session.getId();
        //session.invalidate();s
    }
}
