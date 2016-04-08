package com.shixun.servlet.c4;

import com.shixun.jdbc.d1.JDBCUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Administrator on 2016/3/29.
 * 处理用户注册业务
 */
public class RegisterServlete extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1. 获取用户名和密码
        String userName = req.getParameter("user_account");
        String userPassword = req.getParameter("user_password");
        //2. 验证用户名是否存在
        Connection con = JDBCUtil.getConnection();
        String sql = "select id from user_info where user_name=?";
        PreparedStatement ps = null;
        ResultSet rs = null;
        PrintWriter out = resp.getWriter();
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1,userName);
            rs = ps.executeQuery();
            if(rs.next()) {
                //用户名存在
                out.print("<script>alert('user name is exist! please again input!');location.href='/shixun/html/c4/register.html'</script>");
            } else {
                //添加到数据库，添加成功后进入登录页面
                sql = "insert into user_info(id,user_name,user_password) " +
                        "values(seq_user.nextval,?,?)";
                ps = con.prepareStatement(sql);
                ps.setString(1,userName);
                ps.setString(2,userPassword);
                int rows = ps.executeUpdate();

                if(rows > 0) {//添加成功.跳转到登录界面
                    System.out.println("注册成功！");
                } else {
                    //给客户端提示，同时，进入到注册页面
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

        }
    }
}
