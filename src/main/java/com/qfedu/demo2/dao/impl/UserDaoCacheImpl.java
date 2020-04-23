package com.qfedu.demo2.dao.impl;

import com.qfedu.demo2.dao.UserDao;

/**
 * @author ：Yorick
 * @date ：Created in 2020/4/23 下午 01:19
 * @description：
 * @modified By：
 * @version: $
 */
public class UserDaoCacheImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("insert into the cache....");
    }
}
