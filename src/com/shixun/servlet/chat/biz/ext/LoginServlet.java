package com.shixun.servlet.chat.biz.ext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/3/31.
 */
public class LoginServlet extends HttpServlet {

    private List<User> users = new ArrayList();
//    private List<Message> messages = new ArrayList<>();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("Content-Type: text/html;charset=UTF-8");
        ServletContext application = this.getServletContext();
        User user = new User();
        users.add(user);

        application.setAttribute("users", users);
//        application.setAttribute("messages",messages);
//        HttpSession session = req.getSession();
//        session.setAttribute("user",user);
//        PrintWriter out = resp.getWriter();
//        out.print("<script>alert('欢迎您，您的用户名为：" + user.getName() + ",点击确定进入聊天室');location.href='/shixun/html/chat/main.html'</script>");
        System.out.println("login....'");
        resp.sendRedirect("/shixun/html/chat/ext/main.html");
    }
}
