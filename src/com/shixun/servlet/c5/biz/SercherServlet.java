package com.shixun.servlet.c5.biz;

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

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
