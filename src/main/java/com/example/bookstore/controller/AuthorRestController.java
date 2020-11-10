package com.example.bookstore.controller;

import com.example.bookstore.service.AuthorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorRestController {

    @Autowired
    private AuthorServices authorServices;
}
