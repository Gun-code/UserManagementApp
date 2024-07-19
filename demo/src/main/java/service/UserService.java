package service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import model.User;

public class UserService {

    public List<User> list() throws IOException {
        UserRepository userRepository = new UserRepository();
        List<User> member = new ArrayList<>();
        String userLine;
        while ((userLine = userRepository.userInfo()) != null) {

            String[] info = userLine.split(",");

            member.add(new User(Integer.parseInt(info[0]), info[1], info[2], info[3], info[4], info[5], info[6]));
        }
        return member;
    }

}
