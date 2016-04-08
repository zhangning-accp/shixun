package com.shixun.jdbc.d1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

/**
 * Created by zn on 2016/3/18.
 */
public class JDBCDemo {
    public static void main(String [] args) {
        Connection con = null;
        Statement statement = null;
        //1. 找到对应数据库的驱动包 ***
        try {
            //1. 加载驱动. jdbc Driver接口的实现类。
            con = JDBCUtil.getConnection();
            //3. 创建statement对象，用来执行sql语句 DML
            statement = con.createStatement();
            //1. 添加数据
            StringBuffer sql = new StringBuffer();
//            sql.append("insert into user_info \n" +
//                    "  values(seq_user_info.nextval,\n" +
//                    "    'jdbc2','jdbc2','jdbc1',sysdate,'jdbc1','jdbc1','jdbc','jdbc','jdbc','jdbc',23)\n");
//            System.out.println(sql.toString());
//            //DML 使用executeUpdate方法。
//            int  rows = statement.executeUpdate(sql.toString());
//            if(rows < 1) {
//                System.out.println("添加失败!");
//            } else {
//                System.out.println("添加成功!");
//            }

            //sql = new StringBuffer();
            sql.append("update user_info set nike_name = 'abcdefj' where id = 28");
            //DML 使用executeUpdate方法。
            int rows = statement.executeUpdate(sql.toString());
            if(rows < 1) {
                System.out.println("修改失败!");
            } else {
                System.out.println("修改成功!");
            }
            //删除 。。。。
            //关闭资源

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if(statement != null) {
                        statement.close();
                }
                if(con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
