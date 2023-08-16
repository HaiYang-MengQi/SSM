package com.experience.service.impl;

import com.experience.dao.Comment_get_dao;
import com.experience.entity.Comment;
import com.experience.service.Comment_get_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Comment_get_service_impl implements Comment_get_service {
    @Autowired
    Comment_get_dao comment_get_dao;
    @Override
    public List<Comment> get_comments(int id) {
        return comment_get_dao.getComment(id);
    }
}
