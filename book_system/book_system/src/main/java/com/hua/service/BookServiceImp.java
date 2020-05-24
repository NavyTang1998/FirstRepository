package com.hua.service;

import com.hua.dao.BookDao;
import com.hua.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ProjectName:book_system
 * Package:com.hua.service
 * ClassName:BookServiceImp
 * Description:
 *
 * @Author:huage
 * @Date:2020/5/5 15:57
 */
@Service
public class BookServiceImp implements BookService {
    @Autowired
    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public BookServiceImp() {
    }

    public int addBook(Book book) {
        return bookDao.addBook(book);
    }

    public int deleteBookById(int id) {
        return bookDao.deleteBookById(id);
    }

    public int updateBook(Book book) {
        return bookDao.updateBook(book);
    }

    public Book queryBookById(int id) {
        return bookDao.queryBookById(id);
    }

    public List<Book> queryAllBook() {
        return bookDao.queryAllBook();
    }
}
