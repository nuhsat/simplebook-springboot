package com.nuh.latihan.simplebooklibrary.service;

import com.nuh.latihan.simplebooklibrary.entity.Book;
import com.nuh.latihan.simplebooklibrary.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public Book create(Book book){
        book.setBook_id(UUID.randomUUID().toString());
        return bookRepository.save(book);
    }

    public Book update(Book book){

        Book db = bookRepository.findOne(book.getBook_id());
        db.setBook_title(book.getBook_title());
        db.setBook_author(book.getBook_author());
        db.setBook_isbn(book.getBook_isbn());
        db.setPageNumber(book.getPageNumber());
        db.setHeight(book.getHeight());
        db.setWidth(book.getWidth());
//        db.setPublishedDate(book.getPublishedDate());
        return bookRepository.save(db);
   //       return null;
    }

    public Page<Book> getAll(Pageable pageable){
        return bookRepository.findAll(pageable);
    }

    public Book getById(String id){
        return bookRepository.findOne(id);
    }


    public boolean delete(String id){
        bookRepository.delete(id);
        return true;
    }

}
