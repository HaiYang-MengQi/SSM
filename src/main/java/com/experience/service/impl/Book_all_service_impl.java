package com.experience.service.impl;

import com.experience.dao.Book_all_dao;
import com.experience.entity.Book;
import com.experience.service.Book_all_service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Book_all_service_impl implements Book_all_service {
    @Autowired
    Book_all_dao book_all_dao;

    @Override
    public PageInfo<Book> getAllBooks() {
        PageHelper.startPage(2, 6);
        List<Book> book = book_all_dao.getBookList();
        PageInfo<Book> pageInfo = new PageInfo<>(book);
        System.out.println(pageInfo);
        return pageInfo;
    }
}
