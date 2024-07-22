package service;

import java.io.IOException;
import java.util.List;

import model.Book;
import repository.BookRepository;

public class BookService {

    BookRepository bookRepository;

    public BookService() throws NumberFormatException {
        bookRepository = new BookRepository();
    }

    public List<Book> list() throws IOException {
        return bookRepository.findAll();
    }
}
