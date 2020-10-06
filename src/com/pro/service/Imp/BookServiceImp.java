package com.pro.service.Imp;

import com.pro.dao.BooksDao;
import com.pro.pojo.Books;
import com.pro.service.BookService;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


import java.util.List;

public class BookServiceImp implements BookService {
    //定义dao对象
    public BooksDao booksDao;

    public BooksDao getBooksDao() {
        return booksDao;
    }

    public void setBooksDao(BooksDao booksDao) {
        this.booksDao = booksDao;
    }

    @Override//添加
    public int addBooks(Books books) throws Exception {

        return booksDao.add(books);//抛出异常

    }

    @Override//动态查询查询所有
    public List<Books> getAllByExamp(String bookName, String bookAuthor) {
        return booksDao.getAllByExamp(bookName, bookAuthor);
    }
}

