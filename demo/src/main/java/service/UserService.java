package service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import model.User;
import repository.UserRepository;

public class UserService {
    private UserRepository userRepository;
    private List<User> member;

    public UserService() throws NumberFormatException, IOException {
        UserRepository _userRepository = new UserRepository();
        member = new ArrayList<>();
        String line;
        while ((line = _userRepository.Info()) != null) {

            String[] info = line.split(",");

            member.add(
                    new User(Integer.parseInt(info[0]), info[1], info[2], info[3], info[4], info[5], info[6]));
        }
    }

    public List<User> list() throws IOException {
        userRepository = new UserRepository();
        member.clear();
        String line;
        while ((line = userRepository.Info()) != null) {

            String[] info = line.split(",");

            member.add(
                    new User(Integer.parseInt(info[0]), info[1], info[2], info[3], info[4], info[5], info[6], info[7]));
        }
        return member;
    }

    public String findRegiUser(int _userKey) throws IOException {
        User temp = new User();
        temp = member.get(_userKey - 1);
        return temp.getUserName();
    }

}
