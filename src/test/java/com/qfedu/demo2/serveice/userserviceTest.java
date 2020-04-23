package com.qfedu.demo2.serveice;

import com.qfedu.demo2.config.Appconfig;
import com.qfedu.demo2.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author ：Yorick
 * @date ：Created in 2020/4/23 上午 11:43
 * @description：
 * @modified By：
 * @version: $
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Appconfig.class)
public class userserviceTest {
    @Autowired
    private UserService userService;

    @Test
    public void userserviceTest() {
        userService.add();
    }

}
