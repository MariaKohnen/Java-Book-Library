package de.neuefische.javabooklibrary.service;

import de.neuefische.javabooklibrary.model.Book;
import de.neuefische.javabooklibrary.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private BookRepo bookRepo;

    @Autowired
    public BookService(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    public List<Book> getAllBooks() {
        return bookRepo.getAllBooks();
    }

    public Book getBookByIsbn(String isbn) {
        return bookRepo.getBookByIsbn(isbn);
    }

    public Book addBook(Book book) {
        return bookRepo.addBook(book);
    }

    public Book deleteBook(String isbn) {
        return bookRepo.deleteBook(isbn);
    }

    public Book updateTitleOfBook(Book book) {
        return bookRepo.updateTitleOfBook(book);
    }

    public List<Book> getBookByName(String title) {
        return bookRepo.getBookByName(title);
    }
}
