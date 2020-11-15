package com.example.bookstore.controller;

import com.example.bookstore.model.Author;
import com.example.bookstore.model.Book;
import com.example.bookstore.service.AuthorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class AuthorController {

    @Autowired
    private AuthorServices authorServices;

    @GetMapping("/authors")
    public String findAllAuthor(Model model){
        List<Author> authors = authorServices.findAllAuthors();
        model.addAttribute("authors",authors);
        return "authors-list";
    }

    @GetMapping("/addAuthor")
    public String addAuthorController(Model model){
        model.addAttribute("author",new Author());
        return "add-author";
    }

    @PostMapping("/addAuthor")
    public String addBookController(Author author){
        authorServices.addAuthor(author);
        return "redirect:/authors";
    }


    @GetMapping("delete-author/{id}")
    public String deleteAuthor(@PathVariable("id") int id){
        authorServices.deleteAuthor(id);
        return "redirect:/authors";
    }

}
