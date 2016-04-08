package com.shixun.dao;

import java.util.List;

/**
 * Created by Administrator on 2016/4/8.
 * 一个xml数据源的dao实现.请自行实现,然后在Servelt里调用.
 */
public class XMLUserDAO implements IUserDAO {
    @Override
    public User findOne(long id) {
        return null;
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public boolean delete(User u) {
        return false;
    }

    @Override
    public boolean update(User u) {
        return false;
    }

    @Override
    public boolean add(User u) {
        return false;
    }
}
