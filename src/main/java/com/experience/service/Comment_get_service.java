package com.experience.service;

import com.experience.entity.Comment;

import java.util.List;

public interface Comment_get_service {
     List<Comment> get_comments(int id);
}
