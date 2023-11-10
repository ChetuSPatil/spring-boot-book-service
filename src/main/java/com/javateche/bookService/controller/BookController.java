package com.javateche.bookService.controller;

import com.javateche.bookService.entity.Book;
import com.javateche.bookService.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bookservice")
public class BookController {

    @Autowired
    private BookService bookService;
    @PostMapping
    public ResponseEntity<Book> add(@RequestBody Book book){
        return new ResponseEntity<>(bookService.addBook(book), HttpStatus.CREATED) ;
    }
}
