package com.experience.dao;

import com.experience.entity.Comment;

import java.util.List;

public interface Comment_get_dao {
    List<Comment> getComment(int id);
}
