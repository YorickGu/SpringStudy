package com.qfedu.demo.web;

import com.qfedu.demo.config.Appconfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author ：Yorick
 * @date ：Created in 2020/4/23 上午 01:10
 * @description：
 * @modified By：
 * @version: $
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Appconfig.class)
public class UserControllerTest {
    @Autowired

    private UserController userController;

    @Test
    public void Testadd() {
        userController.add();
    }
}
