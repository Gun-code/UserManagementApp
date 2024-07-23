package repository;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import model.User;

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

    public List<User> list() throws IOException {
        List<User> users = new ArrayList();
        String userLine;
        while ((userLine = br.readLine()) != null) {

            String[] info = userLine.split(",");

            users.add(
                    new User(Integer.parseInt(info[0]), info[1], info[2], info[3], info[4], info[5], info[6]));
        }
        return users;
    }
}
