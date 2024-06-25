package com.vector;

import com.vector.dao.BookDao;
import com.vector.dao.BookDaoImpl;
import com.vector.entity.Book;

public class Main {
    public static void main(String[] args) {

        BookDao bookDao = new BookDaoImpl();
        bookDao.addBook(new Book(1, "Java", "James", 100));
        bookDao.addBook(new Book(2, "Python", "Guido", 200));
        bookDao.addBook(new Book(3, "C++", "Bjarne", 300));
        bookDao.displayAllBooks();

        System.out.println("After deleting book with id 2");
        bookDao.deleteBook(2);
        bookDao.displayAllBooks();
    }
}