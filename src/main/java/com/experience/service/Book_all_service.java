package com.experience.service;

import com.experience.entity.Book;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface Book_all_service {
    PageInfo<Book> getAllBooks(int pageNum,int pageSize);
}
