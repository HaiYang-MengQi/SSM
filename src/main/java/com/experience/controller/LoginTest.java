package com.experience.controller;

import com.experience.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/***
 * 此类用于测试AOP
 */

@Controller
public class LoginTest {
    @Autowired
    LoginService loginService;

    //FIXME 出错,aop切面输出结果重复
    @RequestMapping(value = "/denglu")
    public void login() {
        loginService.login();
    }
}
