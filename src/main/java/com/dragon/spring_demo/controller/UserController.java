package com.dragon.spring_demo.controller;

import com.dragon.spring_demo.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @date 2022/12/14 21:34
 * TODO
 */
public class UserController {
    public static void main(String[] args) {
        //创建Spring 容器对象
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //从容器对象之中获取UserService 对象
        UserService userService = applicationContext.getBean("userService", UserService.class);
        //调用UserService 方法进行方法调用
        userService.add();
    }
}
