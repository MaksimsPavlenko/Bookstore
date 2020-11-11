package com.example.bookstore.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@Table(name = "book")
public class Book {

    @Id
    @Column(name = "book_id")
    private int bookID;

    @Column(name = "title", unique = true)
    private String title;

    @Column(name = "publisher")
    private String publisher;

    @Column(name = "published_date")
    @DateTimeFormat(pattern="dd.MM.yyyy hh:mm")
    private Date publishedDate;


    @OneToMany(fetch = FetchType.EAGER,targetEntity = Author.class,cascade = CascadeType.ALL)
    public List<Author> authors;

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Date getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(Date publishedDate) {
        this.publishedDate = publishedDate;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookID == book.bookID &&
                Objects.equals(title, book.title) &&
                Objects.equals(publisher, book.publisher) &&
                Objects.equals(publishedDate, book.publishedDate) &&
                Objects.equals(authors, book.authors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookID, title, publisher, publishedDate, authors);
    }
}
