package com.pro.dao;

import com.pro.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BooksDao {

    // bookName VARCHAR(20) NULL,  	/*图书名称*/
    //bookAuthor VARCHAR(10) NULL,	/*图书作者*/
    //bookPublish VARCHAR(20) NULL, /*图书出版社*/
    //bookPrice DOUBLE,           /*价格*/
    public int add(Books books) throws Exception; //添加

    public List<Books> getAllByExamp(@Param("bookName") String bookName, @Param("bookAuthor") String bookAuthor);//动态sql查询所有

}
