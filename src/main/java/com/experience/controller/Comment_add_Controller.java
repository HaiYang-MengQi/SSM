package com.experience.controller;

import com.experience.entity.Comment;
import com.experience.service.Comment_add_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Comment_add_Controller {
    @Autowired
    Comment_add_service comment_service;
    // FIXME 下面这片代码出现了奇怪的BUG,平白无故显示404,找不到addComment.jsp
    @RequestMapping("/addComment")
    public void addComment(@RequestBody Comment comment) {
        comment_service.addComment(comment);
    }
}
