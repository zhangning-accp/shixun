package com.shixun.jdbc.d1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by zn on 2016/3/18.
 */
public class JDBCUtil {
    private static final String URL = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
    private static final String USER = "zn";
    private static final String PASSWORD = "zn";

    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            //2. 创建连接.url不同的数据库有不同的写法。
            con = DriverManager.getConnection(
                    URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            return con;
        }
    }
}
