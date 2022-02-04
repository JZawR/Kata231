package web.dao;

import org.springframework.stereotype.Repository;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao{

    @PersistenceContext
    private EntityManager em;

    public void addUser(User user) {
        em.persist(user);
    }

    public void updateUser(User updatedUser, Long id) {
        em.merge(updatedUser);
    }

    public void deleteUser(Long id) {
        em.remove(getUser(id));
    }

    public User getUser(Long id) {
        return em.find(User.class, id);
    }

    @SuppressWarnings("unchecked")
    public List<User> getAllUsers() {
        return em.createQuery("From User").getResultList();
    }
}
