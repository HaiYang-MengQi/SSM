package com.experience.service.impl;

import com.experience.dao.Comment_load_dao;
import com.experience.entity.Comment;
import com.experience.service.Comment_load_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Comment_load_service_impl implements Comment_load_service {
    @Autowired
    Comment_load_dao comment_load_dao;

    @Override
    public List<Comment> getComments(int id) {
        return comment_load_dao.getComments(id);
    }
}
