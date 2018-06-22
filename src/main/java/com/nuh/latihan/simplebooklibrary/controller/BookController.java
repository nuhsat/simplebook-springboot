package com.nuh.latihan.simplebooklibrary.controller;

import com.nuh.latihan.simplebooklibrary.entity.Book;
import com.nuh.latihan.simplebooklibrary.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping
    public Book create(@RequestBody Book book){
        return bookService.create(book);
    }

    @PutMapping
    public Book update(@RequestBody Book book){
        return bookService.update(book);
    }

    @GetMapping
    public Page<Book> getAll(Pageable pageable){
        return bookService.getAll(pageable);
    }

    @GetMapping("/{id}")
    public Book findOne(@PathVariable String id){
        return bookService.getById(id);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable("id") String bookId){
        return bookService.delete(bookId);
    }

}
