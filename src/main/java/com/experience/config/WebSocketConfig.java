//package com.experience.config;
//
//import com.experience.tool.CommentWebSocketHandler;
//import org.springframework.context.annotation.Bean;
//import org.springframework.web.socket.WebSocketHandler;
//import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
//import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;
//
///**
// * @author 汪海洋
// */
//public class WebSocketConfig implements WebSocketConfigurer {
//    @Override
//    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
//        registry.addHandler(commonHandler(),"/commentWebSocket").setAllowedOrigins("*");
//    }
//
//    @Bean
//    private WebSocketHandler commonHandler() {
//        return new CommentWebSocketHandler();
//    }
//}
