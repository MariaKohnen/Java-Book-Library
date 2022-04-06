package de.neuefische.javabooklibrary.repository;

import de.neuefische.javabooklibrary.model.Book;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class BookRepo {

    private Map<String, Book> bookRepo = new HashMap<>();

    public BookRepo() {
    }

    public List<Book> getAllBooks() {
        return List.copyOf(bookRepo.values());
    }

    public Book getBookByIsbn(String isbn) {
        return bookRepo.get(isbn);
    }

    public Book addBook(Book book) {
        Book newBook = new Book(book.getIsbn(), book.getTitle());
        bookRepo.put(newBook.getIsbn(), newBook);
        return newBook;
    }

    public Book deleteBook(String isbn) {
        return bookRepo.remove(isbn);
    }

    public Book updateTitleOfBook(Book book) {
        Book existBook = bookRepo.get(book.getIsbn());
        existBook.setTitle(book.getTitle());
        return book;
    }

}

    /*
    public Book deleteBook(String isbn) {
        Book toDeleteBook = bookRepo.get(isbn);
        bookRepo.remove(toDeleteBook);
        return toDeleteBook;
    }
     */
