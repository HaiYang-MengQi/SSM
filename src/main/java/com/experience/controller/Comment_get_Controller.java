package com.experience.controller;

import com.experience.entity.Comment;
import com.experience.service.Comment_get_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/***
 * 此类用于将用户评论通过JSON的方式发送到前台
 */

@Controller
public class Comment_get_Controller {
    @Autowired
    Comment_get_service comment_get_service;
    @RequestMapping(value = "/getComment",method = RequestMethod.GET)
    @ResponseBody
    public List<Comment> show(@RequestParam(value ="id",required = true) int id){
        List<Comment> list = comment_get_service.get_comments(id);
        System.out.println(list.size());
        return list;
    }

}
