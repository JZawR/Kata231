package web.dao;

import web.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao{
    private static Long USER_COUNTER = 0L;

    List<User> userList = new ArrayList<>();

    {
        userList.add(new User(++USER_COUNTER, "Vasa", "Get", 88));
        userList.add(new User(++USER_COUNTER, "Vanya", "Kat", 99));
        userList.add(new User(++USER_COUNTER, "Lora", "Get", 77));
        userList.add(new User(++USER_COUNTER, "Olga", "Kat", 90));
    }


    @Override
    public void addUser(User user) {
        user.setId(++USER_COUNTER);
        userList.add(user);
    }

    @Override
    public void updateUser() {

    }

    @Override
    public void deleteUser() {

    }

    @Override
    public User getUser(Long id) {
        return userList.stream().filter(user -> user.getId() == id).findAny().orElse(null);
    }

    @Override
    public List<User> getAllUsers() {
        return userList;
    }
}
