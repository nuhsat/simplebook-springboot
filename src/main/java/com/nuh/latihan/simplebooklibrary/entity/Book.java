package com.nuh.latihan.simplebooklibrary.entity;

import org.springframework.data.domain.Example;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Book {

    @Id
    private String book_id;
    private String book_isbn;
    private String book_title;
    private String book_author;
    private int pageNumber;
    private int width;
    private int height;
//    private Date publishedDate;

    public String getBook_id() {
        return book_id;
    }

    public void setBook_id(String book_id) {
        this.book_id = book_id;
    }

    public String getBook_isbn() {
        return book_isbn;
    }

    public void setBook_isbn(String book_isbn) {
        this.book_isbn = book_isbn;
    }

    public String getBook_title() {
        return book_title;
    }

    public void setBook_title(String book_title) {
        this.book_title = book_title;
    }

    public String getBook_author() {
        return book_author;
    }

    public void setBook_author(String book_author) {
        this.book_author = book_author;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

//    public Date getPublishedDate() {
//        return publishedDate;
//    }

//    public void setPublishedDate(Date publishedDate) {
//        this.publishedDate = publishedDate;
//    }
}
