package com.example.bookstore.controller;

import com.example.bookstore.model.Book;
import com.example.bookstore.service.BookServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookRestController {

    @Autowired
    private BookServices bookServices;

    @RequestMapping(value = "/bookList", method = RequestMethod.GET)
    public List<Book> books(){
        return bookServices.findAllBooks();
    }

    @RequestMapping(value = "/addBook", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public Book addBook(@RequestBody Book book){
        return bookServices.addBook(book);
    }
}
