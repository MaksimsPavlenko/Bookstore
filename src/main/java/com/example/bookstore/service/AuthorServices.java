package com.example.bookstore.service;

import com.example.bookstore.model.Author;
import com.example.bookstore.repository.AuthorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServices {

    @Autowired
    private AuthorRepo authorRepo;

    public List<Author> findAllAuthors(){
        return authorRepo.findAll();
    }
    public Author findAuthorByID(int authorID){
        return authorRepo.getOne(authorID);
    }
    public Author addAuthor(Author author){
        return authorRepo.save(author);
    }

    public void deleteAuthor(int authorID){
        authorRepo.deleteById(authorID);
    }
}
