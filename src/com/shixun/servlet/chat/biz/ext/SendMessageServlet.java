package com.shixun.servlet.chat.biz.ext;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Administrator on 2016/3/31.
 */
public class SendMessageServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Message> list = (List<Message>) this.getServletContext().getAttribute("messages");
        User u = (User) req.getSession().getAttribute("user");
        Message message = new Message();
        String content = req.getParameter("msg");
        //message.setUserName(u.getName());
        message.setContent(content);
        list.add(message);
        this.getServletContext().setAttribute("messages",list);
        resp.sendRedirect("/shixun/chat/ui/input");
    }
}
