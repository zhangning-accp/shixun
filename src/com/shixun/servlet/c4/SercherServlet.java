package com.shixun.servlet.c4;

import com.shixun.jdbc.d1.JDBCUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

/**
 * Created by Administrator on 2016/3/29.
 * 处理查询所有用户的servlet
 */
public class SercherServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        StringBuffer html = new StringBuffer("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head lang=\"en\">\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>用户列表</title>\n" +
                "    <style type=\"text/css\">\n" +
                "        th,td {\n" +
                "            border: 1px lightseagreen dashed;\n" +
                "        }\n" +
                "        table{\n" +
                "            border:1px lightseagreen solid;\n" +
                "        }\n" +
                "\n" +
                "\n" +
                "    </style>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <table>\n" +
                "        <thead>\n" +
                "        <th>ID</th>\n" +
                "        <th>用户名</th>\n" +
                "        <th>用户密码</th>\n" +
                "        <th>用户性别</th>\n" +
                "        <th>注册时间</th>\n" +
                "        <th>操作</th>\n" +
                "        </thead>\n" +
                "        <tbody>");

        resp.setCharacterEncoding("UTF-8");
        PrintWriter out = resp.getWriter();
        //查询数据库数据，根据要求生成数据行
        Connection con = JDBCUtil.getConnection();
        Statement st = null;
        ResultSet rs = null;
        try {
            st = con.createStatement();
            String sql = "SELECT  * from user_info";
            rs = st.executeQuery(sql);
            while(rs.next()) {
                int id = rs.getInt("id");
                String userName = rs.getString("user_name");
                String userPassword = rs.getString("user_password");
                String userGender = rs.getString("user_gender");
                Date createDatetime = rs.getDate("create_datetime");
                html.append("<tr>")
                        .append("<td>" + id +"</td>")
                        .append("<td>" + userName + "</td>")
                        .append("<td>" + userPassword + "</td>")
                        .append("<td>" + userGender + "</td>")
                        .append("<td>" + createDatetime + "</td>")
                        .append("<td><a href=\"\">删除</a>\n" +
                                "                    <a href=\"#\">修改</a></td>")
                        .append("</tr>");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        html.append(" </tbody>\n" +
                "    </table>\n" +
                "</body>\n" +
                "</html>");
        out.print(html.toString());
    }
}
