package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUser();

    void save(User userEntity);

    User show(int id);

    void update(int id, User userEntity);

    void delete(int id);
}
