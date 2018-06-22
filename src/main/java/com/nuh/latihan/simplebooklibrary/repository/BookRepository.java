package com.nuh.latihan.simplebooklibrary.repository;

import com.nuh.latihan.simplebooklibrary.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, String> {

}
