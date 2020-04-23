package com.qfedu.demo.service.impl;

import com.qfedu.demo.service.UserService;
import org.springframework.stereotype.Component;

/**
 * @author ：Yorick
 * @date ：Created in 2020/4/23 上午 12:47
 * @description：
 * @modified By：
 * @version: $
 */
@Component
public class UserServiceFestival implements UserService {
    @Override
    public void add() {
        System.out.println("送出优惠券呀，快来呀！！！");
    }
}
