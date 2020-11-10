package com.example.bookstore.service;

import com.example.bookstore.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServices {

    @Autowired
    private BookRepo bookRepo;
}
