package com.graphql.learn.services;

import com.graphql.learn.Entity.Book;

import java.util.List;

public interface BookService {
    //create
    Book create(Book book);
    //getall
    List<Book> getAll();
    //getsinglebook
    Book get(int bookId);
}
