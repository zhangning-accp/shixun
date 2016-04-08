package com.shixun.servlet.chat.ui;

import com.shixun.servlet.chat.biz.User;

import javax.servlet.ServletContext;
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
public class UserListUI extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("UTF-8");
        ServletContext application = this.getServletContext();
        List<User> list = (List<User>) application.getAttribute("users");
        StringBuffer html = new StringBuffer("<html>\n" +
                "\t<head>\n" +
                "\t\t<meta charset=\"UTF-8\"><meta http-equiv=\"refresh\" content=\"1\">" +
                "\t\t<title></title>\n" +
                "\t</head>\n" +
                "\t<body>\n");
            for(User u : list) {
                html.append("<div>" + u.getName()).append("</div>");
            }
        html.append("\t</body>\n" +
                "</html>\n");
        PrintWriter out = resp.getWriter();
        out.print(html);
    }
}
