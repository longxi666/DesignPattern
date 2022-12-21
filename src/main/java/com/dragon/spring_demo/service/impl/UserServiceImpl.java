package com.dragon.spring_demo.service.impl;

import com.dragon.spring_demo.dao.UserDao;
import com.dragon.spring_demo.service.UserService;

/**
 * @date 2022/12/14 21:31
 * TODO 业务逻辑层实现类
 */
public class UserServiceImpl implements UserService {

    //声明一个UserDao类对象
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void add() {
        System.out.print("UserService - ");
        userDao.add();
    }
}
