package service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import model.Book;
import repository.BookRepository;

public class BookService {
    List<Book> books;

    public List<Book> list() throws IOException {
        BookRepository bookRepository = new BookRepository();
        books = new ArrayList<>();
        String line;
        while ((line = bookRepository.Info()) != null) {

            String[] info = line.split(",");

            books.add(new Book(Integer.parseInt(info[0]), info[1], info[2], info[3], info[4], info[5], info[6]));
        }
        return books;
    }

    public String findUserBook(int bookKey) throws IOException {
        if (books == null)
            list();
        Book temp = new Book();
        temp = books.get(bookKey - 1);
        return temp.getTitle();
    }

}
