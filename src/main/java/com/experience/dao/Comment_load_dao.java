package com.experience.dao;

import com.experience.entity.Comment;

import java.util.List;

public interface Comment_load_dao {
    List<Comment> getComments(int id);
}
