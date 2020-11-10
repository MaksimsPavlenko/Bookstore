package com.example.bookstore.controller;

import com.example.bookstore.service.BookServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookRestController {

    @Autowired
    private BookServices bookServices;
}
