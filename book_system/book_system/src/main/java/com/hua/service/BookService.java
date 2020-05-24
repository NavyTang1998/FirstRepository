package com.hua.service;

import com.hua.pojo.Book;

import java.util.List;

/**
 * ProjectName:book_system
 * Package:com.hua.service
 * ClassName:BookService
 * Description:
 *
 * @Author:huage
 * @Date:2020/5/5 15:56
 */
public interface BookService {
    //增加一个Book
    int addBook(Book book);

    //根据id删除一个Book
    int deleteBookById(int id);

    //修改Book
    int updateBook(Book books);

    //根据id查询,返回一个Book
    Book queryBookById(int id);

    //查询全部Book,返回list集合
    List<Book> queryAllBook();
}
