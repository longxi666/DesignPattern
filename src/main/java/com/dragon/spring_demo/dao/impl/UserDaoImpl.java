package com.dragon.spring_demo.dao.impl;

import com.dragon.spring_demo.dao.UserDao;

/**
 * @date 2022/12/14 21:30
 * TODO 数据访问层实现类
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("UserDao ... ");
    }
}
