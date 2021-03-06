package com.example.bookstore.controller;

import com.example.bookstore.model.Author;
import com.example.bookstore.service.AuthorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AuthorRestController {

    @Autowired
    private AuthorServices authorServices;

    @RequestMapping(value = "/authorList", method = RequestMethod.GET)
    public List<Author> authors(){
        return authorServices.findAllAuthors();
    }

    @RequestMapping(value = "/addAuthors", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public Author addAuthor(@RequestBody Author author){
        return authorServices.addAuthor(author);
    }

}
