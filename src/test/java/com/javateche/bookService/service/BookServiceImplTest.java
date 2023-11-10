package com.javateche.bookService.service;

import com.javateche.bookService.entity.Book;
import com.javateche.bookService.repository.BookRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class BookServiceImplTest {
    @InjectMocks
    private BookServiceImpl bookServiceImpl;

    @Mock
    private BookRepository bookRepository;

    @Test
    public void testAddBook(){
        Book book = new Book(123L, "Python", "chetu", 100);
        when(bookRepository.save(book)).thenReturn(book);
        assertThat(bookServiceImpl.addBook(book)).isEqualTo(book);
    }
}
