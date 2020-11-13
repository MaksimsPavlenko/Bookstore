package com.example.bookstore.repository;

import com.example.bookstore.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepo extends JpaRepository<Book, Integer> {

    //list of books with author  using query
    @Query("SELECT new com.example.bookstore.model.Book(b.title, a.firstName, a.lastName) FROM Book b JOIN b.authors a")
    public List<Book> getBookAndAuthors();

    //filter for ui
    @Query( value = "SELECT b FROM Book b WHERE b.title LIKE %:keyword%")
    public List<Book> findByKeyWord(@Param("keyword") String keyword);


}
