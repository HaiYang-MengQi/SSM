package com.experience.controller;

import com.experience.entity.Book;
import com.experience.service.Book_all_service;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class Book_all_Controller {
    @Autowired
    Book_all_service book_all_service;
@RequestMapping(value = "/book")
public void sendBook(int pageNum, int pageSize) {
    PageInfo<Book> info = book_all_service.getAllBooks(pageNum,pageSize);
    //获取分页结果后打印到控制台
    for(Book book : info.getList()) {
        System.out.println(book.toString());
    }
}


}
