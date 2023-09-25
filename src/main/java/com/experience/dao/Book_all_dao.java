package com.experience.dao;

import com.experience.entity.Book;

import java.util.List;

/***
 * 查询所有的图书
 */
public interface Book_all_dao {
    List<Book> getBookList();
}
