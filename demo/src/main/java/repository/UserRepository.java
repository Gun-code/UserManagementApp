package repository;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserRepository {
    FileInputStream fis;
    private BufferedReader br;

    public UserRepository() throws FileNotFoundException {
        fis = new FileInputStream("demo\\src\\main\\resources\\user.csv");
        br = new BufferedReader(new InputStreamReader(fis));
    }

    public int menu() throws IOException {
        return Integer.parseInt(br.readLine());
    }

    public String Info() throws IOException {
        return br.readLine();
    }
}
