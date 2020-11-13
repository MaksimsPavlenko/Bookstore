package com.example.bookstore.controller;

import com.example.bookstore.data.BookData;
import com.example.bookstore.model.Book;
import com.example.bookstore.service.BookServices;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.awt.*;
import java.util.List;

@Controller
public class BookController {

    @Autowired
    private BookServices bookServices;
    Logger logger = LoggerFactory.getLogger(BookController.class);

    @GetMapping("/books")
    public String findAllBooks(Model model){
        List<Book> books = bookServices.findAllBooks();
        model.addAttribute("books",books);
        return "book-list";
    }

    @GetMapping("/addBooks")
    public String addBookController(Model model){
        model.addAttribute("book",new Book());
        return "add-book";
    }

    @PostMapping("/addBooks")
    public String addBookController(Book book){
        bookServices.addBook(book);
//        System.out.println(book.getPublishedDate());
//        System.out.println("date is :");
//       logger.info(book.getPublishedDate().toString());
//        logger.info("ppppppppppppppppppppppppppp");
        return "redirect:/books";
    }

    @GetMapping("delete-book/{id}")
    public String deleteBook(@PathVariable("id") int id){
        bookServices.deleteBookByID(id);
        return "redirect:/books";
    }

    //Find books and book author using data/BookData
    @GetMapping("/booksAndAuthor")
    public String findAllBooksAndAuthor(Model model){
        List<BookData> books = bookServices.titleAndAuthor();
        model.addAttribute("books",books);
        return "bookinfo-list";
    }

}
