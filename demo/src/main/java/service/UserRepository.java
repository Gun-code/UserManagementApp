package service;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserRepository {

    private BufferedReader br;

    public UserRepository() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("demo\\src\\main\\resources\\user.csv");
        br = new BufferedReader(new InputStreamReader(fis));
    }

    public int menu() throws IOException {
        return Integer.parseInt(br.readLine());
    }

    public String userInfo() throws IOException {
        return br.readLine();
    }
}
