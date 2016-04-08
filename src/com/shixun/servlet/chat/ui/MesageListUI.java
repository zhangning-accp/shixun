package com.shixun.servlet.chat.ui;

import com.shixun.servlet.chat.biz.Message;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by Administrator on 2016/3/31.
 */
public class MesageListUI extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        StringBuffer html = new StringBuffer("<html>\n" +
                "\t<head>\n" +
                "\t\t<meta charset=\"UTF-8\">\n" +
                "\t\t\t<meta http-equiv=\"refresh\" content=\"1\">\n" +
                "\t\t<title></title>\n" +
                "\t</head>\n" +
                "\t<body>");

        resp.setCharacterEncoding("UTF-8");
        List<Message> list = (List<Message>) this.getServletContext().getAttribute("messages");
        for(Message m : list) {
            html.append(m.toString());
        }
        html.append( "</body></html>");
        PrintWriter out = resp.getWriter();
        out.print(html);
    }
}
