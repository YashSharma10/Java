package org.ncu.AOP.Dao;

import java.util.List;

import org.ncu.AOP.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
@Repository
public class UserDaoImpl implements UserDao {
	
	@Autowired
	EntityManager entityManager;
	
	@Override
	@Transactional
	public String createUser(User user) {
		entityManager.persist(user);
		return "User Created Successfully";
	}
	@Override
	@Transactional
	public List<User> getAllUsers() {
		 TypedQuery<User> query = entityManager.createQuery("SELECT m FROM User m", User.class);
	        return query.getResultList();
	}
	@Override
	@Transactional
	public User getUserById(int id) {
		return entityManager.find(User.class, id);
	}

	@Override
	@Transactional
	public String deleteUserById(int id) {
		User user = entityManager.find(User.class, id);
        if (user != null) {
            entityManager.remove(user);
            return "User deleted successfully!";
        } else {
            return "User with ID " + id + " not found.";
        }
	}
	

	

}
