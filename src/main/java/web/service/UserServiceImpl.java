package web.service;

import org.springframework.stereotype.Component;
import web.dao.UserDaoImpl;
import web.model.User;

import java.util.List;

@Component
public class UserServiceImpl implements UserService{

    UserDaoImpl userDao = new UserDaoImpl();

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public void updateUser() {
        userDao.updateUser();
    }

    @Override
    public void deleteUser() {
        userDao.deleteUser();
    }

    @Override
    public User getUser(Long id) {
        return userDao.getUser(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }
}
