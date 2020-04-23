package com.qfedu.demo2.config;

import com.qfedu.demo2.dao.UserDao;
import com.qfedu.demo2.dao.impl.UserDaoCacheImpl;
import com.qfedu.demo2.dao.impl.UserDaoImpl;
import com.qfedu.demo2.service.impl.userserviceimpl;
import com.qfedu.demo2.service.UserService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ：Yorick
 * @date ：Created in 2020/4/23 上午 10:11
 * @description：
 * @modified By：
 * @version: $
 */
@Configuration
public class Appconfig {
    @Bean
    @Qualifier
    public UserDao getuserdao() {
        System.out.println("getuserdao");
        return new UserDaoImpl();
    }

    @Bean
    @Qualifier
    public UserDao getuserdaocache() {
        System.out.println("cache");
        return new UserDaoCacheImpl();
    }


    @Bean
    public UserService getuserservice(@Qualifier("getuserdaocache") UserDao userDao) {
        System.out.println("getuserservice");
        return new userserviceimpl(userDao);
    }
}
