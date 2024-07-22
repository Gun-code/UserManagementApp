package repository;

import model.Book;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BookRepository {

    private final static String PATH = "src/main/resources/book.csv";

    private BufferedReader connect() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(PATH);
        return new BufferedReader(new InputStreamReader(fis));
    }

    public List<Book> findAll() throws IOException {
        List<Book> books = new ArrayList<>();

        // 데이터 읽기
        BufferedReader br = connect();
        String colName = br.readLine(); // 데이터 버림
        for (String line = br.readLine(); line != null; line = br.readLine()) {
            Book book = Book.of(line);
            books.add(book);
        }
        br.close();

        return books;
    }

    public Optional<Book> findById(int id) throws IOException {
        BufferedReader br = connect();
        String colName = br.readLine();  // 데이터 버림
        for (String line = br.readLine(); line != null; line = br.readLine()) {
            Book book = Book.of(line);
            if (book.getId() != id) {
                continue;
            }
            br.close();
            return Optional.of(book);
        }
        return Optional.empty();
    }
}