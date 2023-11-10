package com.javateche.bookService.service;

import com.javateche.bookService.entity.Book;
import com.javateche.bookService.repository.BookRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookRepository bookRepository;
    @Override
    public Book addBook(Book book) {
        Book bookSaved = bookRepository.save(book);
        return bookSaved;
    }

    @Override
    public Book updateBook(Book book) {
        return null;
    }

    @Override
    public Book getBook(Long id) {
        return null;
    }

    @Override
    public List<Book> getAllBooks() {
        return null;
    }
}
