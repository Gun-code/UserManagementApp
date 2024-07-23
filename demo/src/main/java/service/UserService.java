package service;

import java.io.IOException;
import java.util.List;

import model.User;
import repository.UserRepository;

public class UserService {
    private List<User> member;

    public List<User> users() throws IOException {
        UserRepository userRepository = new UserRepository();
        member = userRepository.list();
        return member;
    }

}
