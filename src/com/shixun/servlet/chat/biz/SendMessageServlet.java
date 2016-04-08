package com.shixun.servlet.chat.biz;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/3/31.
 */
public class SendMessageServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       //获取消息列表
        List<Message> list = (List<Message>) this.getServletContext().getAttribute("messages");
        //获取当前登录用户
        User u = (User) req.getSession().getAttribute("user");
        //构建消息对象
        Message message = new Message();
        String content = req.getParameter("msg");
        message.setUserName(u.getName());
        message.setContent(content);
        //添加消息到消息列表
        list.add(message);
        //将消息列表重新放入到ServeltContext
        this.getServletContext().setAttribute("messages",list);
        //跳转会输入页面.如果没有这一步,当点击发送消息后,消息页面将是一片空白
        resp.sendRedirect("/shixun/chat/send.jsp");
    }
}
