package com.qfedu.demo.dao.impl;

import com.qfedu.demo.dao.UserDao;
import org.springframework.stereotype.Component;

/**
 * @author ：Yorick
 * @date ：Created in 2020/4/23 上午 01:02
 * @description：
 * @modified By：
 * @version: $
 */
@Component
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("添加用户到数据库中");
    }
}
