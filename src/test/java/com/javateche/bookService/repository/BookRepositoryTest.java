package com.javateche.bookService.repository;

import com.javateche.bookService.entity.Book;
import com.javateche.bookService.repository.BookRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

//@SpringBootTest
@DataJpaTest
public class BookRepositoryTest {

    @Autowired
    private BookRepository bookRepository;

    //private Book book;

    @BeforeEach
    void setUp(){
        Book book = new Book(123L, "Python", "chetu", 15.55);
        bookRepository.save(book);
    }

    @AfterEach
    void tearDown(){
        bookRepository.deleteAll();
    }

    @Test
    void testSave1(){
        Book book = new Book();
        book.setName("The Complete Reference11");
        book.setAuthor("Chetan Patil");
        book.setPrice(800.50);
        bookRepository.save(book);
    }

    @Test
    void testSave(){
        Book book1 = new Book();
        book1.setName("Java");
        book1.setAuthor("chetu1");
        book1.setPrice(100.50);

        Book book = bookRepository.save(book1);
        //Assertions.assertEquals(book1.getName(), book.getName());
        org.assertj.core.api.Assertions.assertThat(book1.getName()).isEqualTo(book.getName());
    }

    @Test
    void testFindByName(){
        List<Book> bookList = bookRepository.findByName("Python");
        Assertions.assertEquals(1, bookList.size());
    }
}
