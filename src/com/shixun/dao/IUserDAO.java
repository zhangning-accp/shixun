package com.shixun.dao;

import java.util.List;

/**
 * Created by Administrator on 2016/4/8.
 * 针对User实体的DAO接口
 */
public interface IUserDAO {
    User findOne(long id);
    List<User> findAll();
    boolean delete(User u);
    boolean update(User u);
    boolean add(User u);
}
