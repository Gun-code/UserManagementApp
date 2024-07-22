package service;

import java.io.IOException;
import java.util.List;

import model.User;
import repository.UserRepository;

public class UserService {
    private final UserRepository userRepository;

    public UserService() throws NumberFormatException {
        userRepository = new UserRepository();
    }

    public List<User> list() throws IOException {
        return userRepository.findAll();
    }
}