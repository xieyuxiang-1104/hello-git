package com.pro.service;

import com.pro.pojo.Books;
import org.springframework.context.annotation.Bean;


import java.util.List;


public interface BookService {
    //添加
    public int addBooks(Books user) throws Exception;

    public List<Books> getAllByExamp(String bookName, String bookAuthor);//动态sql查询所有
}
