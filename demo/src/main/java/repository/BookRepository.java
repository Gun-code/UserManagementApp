package repository;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class BookRepository {
    FileInputStream fis;
    private BufferedReader br;

    public BookRepository() throws FileNotFoundException {
        fis = new FileInputStream("demo\\src\\main\\resources\\book.csv");
        br = new BufferedReader(new InputStreamReader(fis));
    }

    public int menu() throws IOException {
        return Integer.parseInt(br.readLine());
    }

    public String Info() throws IOException {
        return br.readLine();
    }
}
