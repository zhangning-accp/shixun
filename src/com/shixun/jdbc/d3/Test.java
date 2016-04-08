package com.shixun.jdbc.d3;

import com.shixun.jdbc.d1.JDBCUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Administror on 2016/3/22.
 */
public class Test {

    public static List<List<Object>> findDatas(String sql) {
        List reuslt = new ArrayList();
        Connection con = JDBCUtil.getConnection();
        PreparedStatement ps = null;
        ResultSet resultSet = null;
        ResultSetMetaData rsmd = null;
            try {
            ps = con.prepareStatement(sql);
            resultSet = ps.executeQuery();
            rsmd = resultSet.getMetaData();
            int columNum = rsmd.getColumnCount();
            while (resultSet.next()) {
                List datas = new ArrayList<>();
                for (int i = 0; i < columNum; i++) {
                    Object value = resultSet.getObject(rsmd.getColumnName(i + 1));
                    datas.add(value);
                }
                reuslt.add(datas);
            }
           } catch (SQLException e) {
            e.printStackTrace();
        }
        return reuslt;
    }

    public static void main(String [] args) {
//        String sql = "select * from help";
//        List list = findDatas(sql);
//        for(int i = 0; i < list.size();i ++) {
//            List datas = list.get(i);
//            for() {
//
//            }
//        }
//        System.out.println(list);

    }
}
