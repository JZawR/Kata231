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
    public void updateUser(User updatedUser, Long id) {
        User willChange = getUser(id);
        willChange.setName(updatedUser.getName());
        willChange.setSurname(updatedUser.getSurname());
        willChange.setAge(updatedUser.getAge());
    }

    @Override
    public void deleteUser(Long id) {
        userList.removeIf(user -> user.getId().equals(id));
    }

    @Override
    public User getUser(Long id) {
        return userList.stream().filter(user -> user.getId().equals(id)).findAny().orElse(null);
    }

    @Override
    public List<User> getAllUsers() {
        return userList;
    }
}
