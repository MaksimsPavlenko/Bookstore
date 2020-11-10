package com.example.bookstore.service;

import com.example.bookstore.model.Book;
import com.example.bookstore.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServices {

    @Autowired
    private BookRepo bookRepo;

    public List<Book> findAllBooks(){
        return bookRepo.findAll();
    }

    public Book findById(int bookID){
        return bookRepo.getOne(bookID);
    }

    public Book addBook(Book book){
        return bookRepo.save(book);
    }

    public void deleteBookByID(Integer bookID){
        bookRepo.deleteById(bookID);
    }

}
