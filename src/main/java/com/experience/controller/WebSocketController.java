package com.experience.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WebSocketController {

    @RequestMapping(value = "/websocket", method = RequestMethod.GET)
    public String websocketPage() {
        return "websocket"; // 返回对应的WebSocket页面
    }
}
