package web.dao;


import org.springframework.stereotype.Repository;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {


    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<User> getAllUser() {
        return entityManager.createQuery("select u from User u", User.class)
                .getResultList();
    }

    @Override
    public void save(User userEntity) {
        entityManager.persist(userEntity);
    }

    @Override
    public User show(int id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void update(int id, User userEntity) {
        User userToUpdate = show(id);
        userToUpdate.setId(userEntity.getId());
        userToUpdate.setFirstname(userEntity.getFirstname() );
        userToUpdate.setLastname(userEntity.getLastname());
        userToUpdate.setAge(userEntity.getAge());
        save(userToUpdate);
    }

    @Override
    public void delete(int id) {
        javax.persistence.Query q= entityManager.createQuery("delete from User where id = :id");
        q.setParameter("id", id);
        int deletedRows = q.executeUpdate();
    }
}
