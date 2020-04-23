package com.qfedu.demo.web;

import com.qfedu.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author ：Yorick
 * @date ：Created in 2020/4/23 上午 01:07
 * @description：
 * @modified By：
 * @version: $
 */
@Component
public class UserController {
    @Autowired
    @Qualifier("userServiceNormal")
    private UserService userService;

    public void add() {
        userService.add();
    }

}
