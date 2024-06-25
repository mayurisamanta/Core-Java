package com.vector.dao;

import com.vector.entity.Book;

public interface BookDao {

    void addBook(Book book);

    void deleteBook(Integer bookId);

    void displayAllBooks();
}
