package com.qfedu.demo.config;

import com.qfedu.demo.dao.UserDao;
import com.qfedu.demo.service.UserService;
import com.qfedu.demo.web.UserController;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author ：Yorick
 * @date ：Created in 2020/4/22 下午 11:41
 * @description：配置类
 * @modified By：
 * @version: $
 */
@Configuration
//@ComponentScan("com.qfedu.demo")
//@ComponentScan(basePackages = {"com.qfedu.demo.web", "com.qfedu.demo.service","com.qfedu.demo.dao"})
@ComponentScan(basePackageClasses = {UserController.class, UserService.class, UserDao.class})
public class Appconfig {
}
