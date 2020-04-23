package com.qfedu.demo2.dao;

import com.qfedu.demo2.config.Appconfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author ：Yorick
 * @date ：Created in 2020/4/23 上午 10:18
 * @description：
 * @modified By：
 * @version: $
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Appconfig.class)
public class userDaoTest {
    @Autowired
    private UserDao userDao;

    @Test
    public void Testdemo2userDao() {
        userDao.add();
    }
}
