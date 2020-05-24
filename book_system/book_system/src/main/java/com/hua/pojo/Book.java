package com.hua.pojo;

/**
 * ProjectName:book_system
 * Package:com.hua.pojo
 * ClassName:Book
 * Description:
 *
 * @Author:huage
 * @Date:2020/5/5 15:14
 */
public class Book {
    private int bookID;
    private String bookName;
    private int bookCounts;

    public Book() {
    }

    public Book(int bookID, String bookName, int bookCounts) {
        this.bookID = bookID;
        this.bookName = bookName;
        this.bookCounts = bookCounts;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookCounts() {
        return bookCounts;
    }

    public void setBookCounts(int bookCounts) {
        this.bookCounts = bookCounts;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookID=" + bookID +
                ", bookName='" + bookName + '\'' +
                ", bookCounts=" + bookCounts +
                '}';
    }
}
