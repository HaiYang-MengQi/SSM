package com.experience.controller;

import com.experience.entity.Comment;
import com.experience.service.Comment_load_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.testng.annotations.Test;

import java.util.List;

/**
 * @author 汪海洋
 */
@Controller
public class Comment_load_Controller {
    @Autowired
    Comment_load_service comment_load_service;
    @RequestMapping("/loadComments")
    @ResponseBody
    public void show(@RequestParam(value = "id", required = true) int id) {
        List<Comment> list = comment_load_service.getComments(id);
        for (Comment comment : list) {
            System.out.println(comment.toString()
            );
        }

    }
}
