package com.example.bookstore.service;

import com.example.bookstore.repository.AuthorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorServices {

    @Autowired
    private AuthorRepo authorRepo;
}
