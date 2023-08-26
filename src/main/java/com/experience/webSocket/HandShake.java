package com.experience.webSocket;

import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.http.server.ServletServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.server.HandshakeInterceptor;

import javax.servlet.ServletRequestEvent;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;
//TODO 学习此类

/**
 * 这是一个握手拦截器的类
 * @author 汪海洋
 *
 */
@Component
public class HandShake implements HandshakeInterceptor {

    @Override
    //        在处理WebSocket握手时, ServerHttpRequest对象表示了握手请求.
//                这是一个抽象接口,
//                它被设计成通用的,
//                以便在不同的Web服务器环境中使用,
//                不仅仅局限于Servlet容器.
//                然而,
//                由于每个Web服务器环境都有其独特的特性,
//                要在握手请求中获取特定环境的信息(例如HTTP会话),
//                有时需要使用特定环境的功能.
//        在你的代码中,
//        你需要从握手请求中获取HTTP会话（HttpSession）,
//        以便获取用户的uid.但是,
//        ServerHttpRequest并没有直接提供获取HTTP会话的方法,
//        因为在不同的Web服务器环境中可能有不同的方式来获取会话.
//        在Servlet环境中,
//        HttpServletRequest对象可以用于访问HTTP会话.
//        因此,为了在处理握手请求时获取HTTP会话,
//        你需要将ServerHttpRequest转换为y适当的Servlet环境下的实现,
//        即ServletServerHttpRequest,
//        这样就能够通过getServletRequest()方法获取到HttpServletRequest,
//        从而进一步获取HTTP会话。
//        所以,ServerHttpRequest是一个通用的抽象接口,
//        而ServletServerHttpRequest是特定环境（Servlet容器）下的实现,
//        用于访问HTTP会话等与Servlet相关的功能.
//        在处理WebSocket握手时,
//        你可能需要使用ServletServerHttpRequest来获取Servlet容器的特定功能。
    /**
     * @param ServletHttpRequest 表示通用的握手请求,这是一个抽象接口,
     *                           通用以便在不同web服务器环境中使用
     * @return boolean
     */
    public boolean beforeHandshake(ServerHttpRequest request, ServerHttpResponse response, WebSocketHandler wsHandler, Map<String, Object> attributes) throws Exception {
//        ServletServerHttpRequest servletRequest = (ServletServerHttpRequest) request;
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
//        你可能需要使用ServletServerHttpRequest来获取Servlet容器的特定功能。

//        实际上,在处理WebSocket握手时,
//        你确实可以直接使用HttpServletRequest,
//        而不需要将ServerHttpRequest转换为ServletServerHttpRequest.
//        在Spring的HandshakeInterceptor接口中,
//        beforeHandshake方法的参数ServerHttpRequest request
//        实际上就是HttpServletRequest的子类,
//        因此你可以直接使用request来获取HttpSession，而无需进行额外的转换
        HttpSession session = httpServletRequest.getSession(false);
        Long uid = (Long) session.getAttribute("uid");
        //做正向判断,如果uid为空直接返回false,拒绝握手
        if(uid == null){
            return  false;
        }
        System.out.println("用户uid"+uid+"正在准备握手!");
        attributes.put("uid", uid);
        //可以握手
        return true;
    }
    @Override
    public void afterHandshake(ServerHttpRequest request, ServerHttpResponse response, WebSocketHandler wsHandler, Exception exception) {
        System.out.println("after hand");
    }
}
