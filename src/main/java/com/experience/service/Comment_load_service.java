package com.experience.service;

import com.experience.entity.Comment;

import java.util.List;

public interface Comment_load_service {
    List<Comment> getComments(int id);
}
