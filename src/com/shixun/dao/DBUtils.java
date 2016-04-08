package com.shixun.dao;

import oracle.jdbc.rowset.OracleCachedRowSet;

import javax.sql.RowSet;
import javax.sql.RowSetMetaData;
import javax.sql.rowset.CachedRowSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/4/8.
 */
public class DBUtils {
    //建立连接
    //执行sql语句...
    private Connection connection;
    private PreparedStatement ps;
    private CachedRowSet rowSet;
    private final static String USER_NAME = "zn";
    private final static String USER_PASSWORD = "zn";
    private final static String DB_URL = "jdbc:oracle:thin@localhost:1521/xe";
    private void builderConnection() {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            connection = DriverManager.getConnection(DB_URL,USER_NAME,USER_PASSWORD);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
            close();
        }
    }
    private void builderPreparedStatement(String sql) {
        if(connection == null) {
          this.builderConnection();
        }
        try {
            ps = connection.prepareStatement(sql);
        } catch (SQLException e) {
            e.printStackTrace();
            close();
        }
    }

    /**
     * 执行dml操作
     * @param sql sql语句
     * @param params 该方法是用PreparedStatement作为执行对象,
     *               所以如果有多个条件需要使用?,该参数列表就是?占位符的值.可以为null如果为null或长度为0,则表示没有任何?参数需要设定
     * @return 成功为true,反之为false;
     */
    public boolean dml(String sql,Object ... params) {
        try {
            if (ps == null) {
                builderPreparedStatement(sql);
            }
            if(params != null) {
                for (int i = 0; i < params.length; i++) {
                    ps.setObject((i + 1), params[i]);
                }
            }
            return ps.executeUpdate() > 0;
        }catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close();
        }
        return false;
    }

    /**
     *
     * @param sql
     * @param params
     * @return
     */
    public List<Map> query(String sql,Object ... params) {
        /*
        该方法使用了jdbc里提供的可断开结果集.也可以使用ResultSet.这里使用此类型的结果集仅仅是为大家扩展一下知识.
         */


         /*
                代表查询语句所得到的查询结果.和以前不同的是,我们这里之所以没有返回RowSet或ResultSet对象,
                是因为我们假设使用者不知道这两个对象怎么用.所以将结果封装成一个集合
                List代表的是所有的数据,但每条数据都有多个列值,所以使用map来包装.集合里的每个map都是一条记录.map的key就是查询的列名.value就是对应的值
                注意,这里也可以直接返回RowSet或ResultSet对象.你可以根据自己的情况做调整
             */
        List<Map> list = new ArrayList<Map>();
        try {
            if (ps == null) {
                builderPreparedStatement(sql);
            }
            if(params != null) {
                for (int i = 0; i < params.length; i++) {
                    ps.setObject((i + 1), params[i]);
                }
            }
            rowSet = new OracleCachedRowSet();
            rowSet.populate(ps.executeQuery());
            RowSetMetaData meta = (RowSetMetaData) rowSet.getMetaData();
            int count = meta.getColumnCount();//获取列数
            while(rowSet.next()) {
                Map<String,Object> map = new HashMap<>();
                for (int i = 0; i < count; i++) {
                    String colName = meta.getColumnName(i);//获取当前列的列名
                    Object colValue = rowSet.getObject(colName);//获取列名对应的值
                    map.put(colName,colValue);
                }
                list.add(map);
            }
        }catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close();
        }
        return list;
    }

    private void close() {
        try {
            if (connection != null) {
                connection.close();
                connection = null;
            }
            if (ps != null) {
                ps.close();
                ps = null;
            }
            if (rowSet != null) {
                rowSet.close();
                rowSet = null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
