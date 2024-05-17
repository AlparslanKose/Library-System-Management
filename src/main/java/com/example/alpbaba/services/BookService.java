package com.example.alpbaba.services;

import com.example.alpbaba.dao.BookDAO;
import com.example.alpbaba.models.Book;
import com.example.alpbaba.dao.BookDAO;
import com.example.alpbaba.models.Book;

import java.util.List;

public class BookService {
    private BookDAO bookDAO;

    public BookService() {
        this.bookDAO = new BookDAO();
    }

    public List<Book> getAllBooks() {
        return bookDAO.getAllBooks();
    }

    // Add other business logic as needed
}
