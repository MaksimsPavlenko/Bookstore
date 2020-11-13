package com.example.bookstore.service;

import com.example.bookstore.data.BookData;
import com.example.bookstore.model.Book;
import com.example.bookstore.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
        System.out.println(book.getPublishedDate());
        return bookRepo.save(book);
    }

    public void deleteBookByID(Integer bookID){
        bookRepo.deleteById(bookID);
    }

    //list of books with author using Book Data
    public List<BookData> titleAndAuthor() {
        ArrayList<BookData> titleAuthor = new ArrayList<>();
        bookRepo.findAll().forEach(book -> {
            BookData bookData = new BookData();
            bookData.setTitle(book.getTitle());
            bookData.setPublisher(book.getPublisher());
            bookData.setPublishedDate(book.getPublishedDate());
            bookData.getAuthors();
            titleAuthor.add(bookData);
        });
        return titleAuthor;
    }
    //list of books with author  using query
    public List<Book> titleAndAuthorQuery(){
       return bookRepo.getBookAndAuthors();
    }

}
