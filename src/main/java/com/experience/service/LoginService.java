package com.experience.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
    //FIXME 出错,aop切面输出结果重复
    public void login(){
        System.out.println("您登录了!");
    }
}
