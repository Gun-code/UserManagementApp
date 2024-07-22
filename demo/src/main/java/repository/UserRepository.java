package repository;

import model.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepository {

    private final static String PATH = "src/main/resources/user.csv";

    private BufferedReader connect() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(PATH);
        return new BufferedReader(new InputStreamReader(fis));
    }

    public List<User> findAll() throws IOException {
        List<User> users = new ArrayList<>();

        // 데이터 읽기
        BufferedReader br = connect();
        String colName = br.readLine(); // 데이터 버림
        for (String line = br.readLine(); line != null; line = br.readLine()) {
            User user = User.of(line);
            users.add(user);
        }
        br.close();

        return users;
    }

    public Optional<User> findById(int id) throws IOException {
        BufferedReader br = connect();
        String colName = br.readLine();  // 데이터 버림
        for (String line = br.readLine(); line != null; line = br.readLine()) {
            User user  = User.of(line);
            if (user .getId() != id) {
                continue;
            }
            br.close();
            return Optional.of(user );
        }
        return Optional.empty();
    }
}