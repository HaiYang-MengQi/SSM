package com.experience.webSocket;

import org.springframework.stereotype.Component;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

import javax.annotation.Resource;
//TODO 学习此类
@Component
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer {
    @Resource
    MyWebSocketHandler handler;
    @Resource
    HandShake handShake;
    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
//        浏览器支持webSocket
        registry.addHandler(handler,"/ws").addInterceptors(handShake);
        /**
         * @deprecated 这些方法可能会过时
         */
//        浏览器不支持webSocket
        registry.addHandler(handler,"/ws/sockjs").addInterceptors(handShake).withSockJS();
    }
}
