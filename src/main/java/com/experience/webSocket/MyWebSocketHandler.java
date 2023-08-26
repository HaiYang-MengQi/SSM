package com.experience.webSocket;

import org.springframework.stereotype.Component;
import org.springframework.web.socket.*;

//TODO 学习此类
@Component
public class MyWebSocketHandler implements WebSocketHandler {
    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        System.out.println(session.getId());
        System.out.println(session.getUri());
        System.out.println("获取本机地址"+session.getLocalAddress());
        System.out.println("获取远程地址"+session.getRemoteAddress());
        System.out.println("session.toString"+session.toString());
        System.out.println("ConnectionEstablished");
    }

    @Override
    public void handleMessage(WebSocketSession session, WebSocketMessage<?> message) throws Exception {
        session.sendMessage(new TextMessage("hello World"));
        System.out.println("**************************************");
        System.out.println("下面是webSocketMessage");
        System.out.println("message.toString"+message.toString());
    }

    @Override
    public void handleTransportError(WebSocketSession session, Throwable exception) throws Exception {
        System.out.println("TransportError");
        System.out.println("出现错误!");
        System.out.println(exception.getStackTrace());
        System.out.println(exception.getMessage());
    }

    /**
     * @author 汪海洋
     * @param session
     * @param closeStatus
     * @throws Exception
     */
    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus closeStatus) throws Exception {
        System.out.println("Connection Closed");
        System.out.println("连接关闭");
        System.out.println(closeStatus.getCode());
    }

    @Override
    public boolean supportsPartialMessages() {
        return false;
    }
}
