package com.qdedu.demo.service;

import com.qfedu.demo.config.Appconfig;
import com.qfedu.demo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @author ：Yorick
 * @date ：Created in 2020/4/22 下午 11:44
 * @description：TestUserService
 * @modified By：
 * @version: $
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Appconfig.class)
public class UserServiceTest {

    @Qualifier("userServiceFestival")
    @Autowired
    private UserService userService;


    @Resource(name = "userServiceNormal")
    private UserService userService1;


    /**
     * @Description: 测试类
     * @Param:
     * @return:
     */
    @Test
    public void Testadd() {
        userService.add();
        userService1.add();
    }

}
