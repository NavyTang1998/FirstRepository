package com.hua.dao;

import com.hua.pojo.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * ProjectName:book_system
 * Package:com.hua.dao
 * ClassName:BookDao
 * Description:
 *
 * @Author:huage
 * @Date:2020/5/5 15:17
 */
public interface BookDao {
    //增加一个Book
    int addBook(Book book);

    //根据id删除一个Book
    int deleteBookById(@Param("bookID")int id);

    //修改Book
    int updateBook(Book book);

    //根据id查询,返回一个Book
    Book queryBookById(@Param("bookID")int id);

    //查询全部Book,返回list集合
    List<Book> queryAllBook();
}
