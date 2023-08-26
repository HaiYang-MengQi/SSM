package com.experience.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {
    @Pointcut("execution(* com.experience.service.LoginService.login())")
    private void method(){}
    //FIXME 出错,aop切面输出结果重复
    @Before("method() ")
    public void show(){
        System.out.println("登录前检查!");
    }
}
