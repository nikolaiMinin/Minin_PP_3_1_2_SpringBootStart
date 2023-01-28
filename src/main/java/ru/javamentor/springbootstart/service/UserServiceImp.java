package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.UserDAO;
import web.model.User;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    private UserDAO userDAO;


    @Override
    @Transactional
    public List<User> getAllUser() {
        return userDAO.getAllUser();
    }


    @Override
    @Transactional
    public void save(User userEntity) {
        userDAO.save(userEntity);
    }

    @Override
    @Transactional
    public User show(int id) {
        return userDAO.show(id);
    }

    @Override
    @Transactional
    public void update(int id, User userEntity) {
        userDAO.update(id, userEntity);
    }

    @Override
    @Transactional
    public void delete(int id) {
        userDAO.delete(id);
    }
}
