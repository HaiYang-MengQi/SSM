package com.experience.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class User_login_interceptor extends HandlerInterceptorAdapter {
//对程序进行安全控制,权限校验
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("拦截器已经拦截");
        String uri = request.getRequestURI();
        if (uri.indexOf("/login")>=0||uri.indexOf("/userLogin")>=0){
            return true;
        }
        HttpSession session = request.getSession();
        if (session.getAttribute("user") != null){
            return true;
        }
        request.setAttribute("msg", "您还没登录!");
        request.getRequestDispatcher("/login.jsp").forward(request, response);
        return false;
    }
//对请求域中的模型和视图进行修改,它会在控制器方法调用之后且视图解析之前执行
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("拦截器中部方法执行");
    }
//资源清理,日志清理等工作
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("拦截器尾部方法执行");
    }
}
