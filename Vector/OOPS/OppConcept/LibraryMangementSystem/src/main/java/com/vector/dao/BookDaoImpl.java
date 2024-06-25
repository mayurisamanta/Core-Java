package com.vector.dao;

import com.vector.entity.Book;

import java.util.ArrayList;
import java.util.List;

public class BookDaoImpl implements BookDao{

    private List<Book> bookList = new ArrayList<>();

    private Integer id = 0;

    @Override
    public void addBook(Book book) {
        book.setBookId(id);
        bookList.add(book);
        id = ++id;

    }

    @Override
    public void deleteBook(Integer bookId) {

        for (Book book : bookList) {
            if (book.getBookId().equals(bookId)) {
                bookList.remove(book);
                break;
            }
        }

    }

    @Override
    public void displayAllBooks() {
        for (Book book : bookList) {
            System.out.println(book);
        }
    }
}
