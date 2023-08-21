package com.experience.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {
    @Pointcut("execution(void com.experience.service.LoginService.login())")
    private void method(){}
    @Before("method() ")
    public void show(){
        System.out.println("登录前检查!");
    }
}
