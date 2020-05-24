package com.hua.controller;

import com.hua.pojo.Book;
import com.hua.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * ProjectName:book_system
 * Package:com.hua.controller
 * ClassName:BookController
 * Description:
 *
 * @Author:huage
 * @Date:2020/5/5 16:37
 */
@Controller
public class BookController {
    @Resource
    private BookService bookService;

    public void setBookService(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping("/a")
    public String queryAllBook(Model model){
        List<Book> books = bookService.queryAllBook();
        model.addAttribute("books",books);
        return "index";
    }
}
