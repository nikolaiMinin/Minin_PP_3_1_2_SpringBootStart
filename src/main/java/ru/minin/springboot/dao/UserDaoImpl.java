package ru.minin.springboot.dao;

import org.springframework.stereotype.Repository;
import ru.minin.springboot.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {
    @PersistenceContext
    private EntityManager manager;


    @Override
    public List<User> getAllUsers() {
        List<User> users = manager.createQuery("select us from User us").getResultList();
        return users;
    }

    @Override
    public User getUserById(int id) {
        return manager.find(User.class, id);
    }

    @Override
    public void saveUser(User user) {
        manager.persist(user);
    }

    @Override
    public void updateUser(int id, User updatedUser) {
        User user = manager.find(User.class, id);
        user.setFirstName(updatedUser.getFirstName());
        user.setLastName(updatedUser.getLastName());
    }

    @Override
    public void deleteUser(int id) {
        manager.remove(getUserById(id));
    }
}
