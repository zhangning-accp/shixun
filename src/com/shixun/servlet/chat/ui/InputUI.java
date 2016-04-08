package com.shixun.servlet.chat.ui;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Administrator on 2016/3/31.
 */
public class InputUI extends HttpServlet {
    private StringBuffer html = new StringBuffer("<html>\n" +
            "\t<head>\n" +
            "\t\t<meta charset=\"UTF-8\">\n" +
            "\t\t<title></title>\n" +
            "\t</head>\n" +
            "\t<body>\n" +
            "\t\t<form action=\"/shixun/chat/biz/send.do\">\n" +
            "\t\t\t<table>\n" +
            "\t\t\t\t<tr>\n" +
            "\t\t\t\t\t<td><input type=\"text\" name=\"msg\"></td>\n" +
            "\t\t\t\t\t<td><input type=\"submit\" value=\"发送消息\"></td>\n" +
            "\t\t\t\t</tr>\n" +
            "\t\t\t</table>\n" +
            "\t\t\t\n" +
            "\t\t</form>\n" +
            "\t</body>\n" +
            "</html>");
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("UTF-8");
        PrintWriter out = resp.getWriter();
        out.print(html);
    }
}
