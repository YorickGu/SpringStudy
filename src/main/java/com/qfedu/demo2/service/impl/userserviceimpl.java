package com.qfedu.demo2.service.impl;

import com.qfedu.demo2.dao.UserDao;
import com.qfedu.demo2.service.UserService;

/**
 * @author ：Yorick
 * @date ：Created in 2020/4/23 上午 10:33
 * @description：
 * @modified By：
 * @version: $
 */
public class userserviceimpl implements UserService {

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    private UserDao userDao;

    public userserviceimpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void add() {
        System.out.println("demo2.....userservice.....");
        userDao.add();
    }


}
