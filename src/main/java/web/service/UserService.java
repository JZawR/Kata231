package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    void updateUser();
    void deleteUser();
    User getUser(Long id);
    List<User> getAllUsers();
}
