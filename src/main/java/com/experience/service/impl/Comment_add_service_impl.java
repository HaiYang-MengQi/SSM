package com.experience.service.impl;

import com.experience.dao.Comment_add_dao;
import com.experience.entity.Comment;
import com.experience.service.Comment_add_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Comment_add_service_impl implements Comment_add_service {
    @Autowired
    Comment_add_dao comment_addDao;
    @Override
    public void addComment(Comment comment) {
        comment_addDao.addComment(comment);
    }
}
