package com.javateche.bookService.service;

import com.javateche.bookService.entity.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {
    Book addBook(Book book);
    Book updateBook(Book book);
    Book getBook(Long id);
    List<Book> getAllBooks();

}
