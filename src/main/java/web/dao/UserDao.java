package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    void addUser(User user);
    void updateUser();
    void deleteUser();
    User getUser(Long id);
    List<User> getAllUsers();
}
