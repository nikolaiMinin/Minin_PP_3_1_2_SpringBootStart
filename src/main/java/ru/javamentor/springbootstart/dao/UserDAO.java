package web.dao;

import web.model.User;

import java.util.List;

public interface UserDAO {
    List<User> getAllUser();

    void save(User userEntity);

    User show(int id);

    void update(int id, User userEntity);

    void delete(int id);
}
