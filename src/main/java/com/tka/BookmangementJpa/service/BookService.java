package com.tka.BookmangementJpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.BookmangementJpa.BookRepository;
import com.tka.BookmangementJpa.enitity.Book;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    // Create or Update a book
    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    // Get all books
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    // Get a book by ID
    public Book getBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    // Delete a book by ID
    public void deleteBookById(Long id) {
        bookRepository.deleteById(id);
    }
    
   public void getByName(String name) {
	   bookRepository.findByName(name);
   }
}
