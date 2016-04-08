package com.shixun.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/4/8.
 * OracleUserDao的实现,所有代码未经过单元测试.
 */
public class OracleUserDAO implements IUserDAO {
    DBUtils db = new DBUtils();
    @Override
    public User findOne(long id) {
        String sql = "select * from user_info where id = ?";
        List<Map> list = db.query(sql,id);
        for(Map m : list) {
            User u = transMap2User(m);
            return u;
        }
        return null;
    }

    @Override
    public List<User> findAll() {
        String sql = "select * from user_info";
        List<Map> list = db.query(sql);
        List<User> users = new ArrayList<>();
        for(Map m : list) {
            User u = transMap2User(m);
            users.add(u);
        }
        return users;
    }

    @Override
    public boolean delete(User u) {
        return false;
    }

    @Override
    public boolean update(User u) {
        String sql = "update user_info set user_account = ?,user_password = ? ....";
        return db.dml(sql,"ddd","ddd");
    }

    @Override
    public boolean add(User u) {
        return false;
    }


    /**
     * 将map集合转换成user对象
     */
    private User transMap2User(Map map) {
        User u = new User();
        u.setId(Long.parseLong(map.get("id") + ""));
        u.setCreateDatetime((Date)map.get("CREATE_DATETIME"));
        u.setUserAccount(map.get("user_account") + "");
        u.setUserAddress(map.get("user_address") + "");
        u.setUserConstellation(map.get("user_constellation") + "");
        u.setUserEmail(map.get("user_email") + "");
        u.setUserGender(map.get("user_gender") + "");
        u.setUserImg(map.get("user_img") + "");
        u.setUserPassword(map.get("user_password") + "");
        u.setUserPhone(map.get("user_phone") + "");
        return u;
    }
}
