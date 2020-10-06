package com.pro.contoller;

import com.pro.pojo.Books;
import com.pro.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class BooksHandle {


    /*BookService bookService = null;*/
    //实例化一个业务逻辑层代码
    @Autowired      //默认的通过类型自动注入
    @Qualifier("bookService")
    private BookService bookService;

    /*
     * 查询所有
     * */
    @RequestMapping(value = "mybook")
    public String find(Model model,String bookAuthor,String bookName) {
        //得到要修改的用户ID
        List<Books> book = bookService.getAllByExamp(bookName, bookAuthor);
        System.out.println("==============="+book);
        model.addAttribute("list", book);
        return "index";
    }
}
