package com.hua.dao;

import com.hua.pojo.Book;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * ProjectName:book_system
 * Package:com.hua.dao
 * ClassName:test
 * Description:
 *
 * @Author:huage
 * @Date:2020/5/5 17:17
 */
public class test {
    @Test
    public void a(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookDao bookDao = context.getBean("bookDao", BookDao.class);
        List<Book> books = bookDao.queryAllBook();
        System.out.println(books);
    }
}
