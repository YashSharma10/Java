package org.ncu.movie_app_v1.DAO;

import java.util.List;

import org.ncu.movie_app_v1.Entity.Booking;
import org.ncu.movie_app_v1.Entity.User;
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
	public String saveUser(User user) {
		entityManager.persist(user);
		return null;
	}

	@Override
	@Transactional
	public User getUserById(int userId) {
		
		return entityManager.find(User.class, userId);
	}

	@Override
	@Transactional
	public List<User> getAllUsers() {
		 TypedQuery<User> query = entityManager.createQuery("SELECT m FROM User m", User.class);
	        return query.getResultList();
	}

	@Override
	@Transactional
	public String  updateUserById(int userId ,User updateUser) {
		User existingUser = entityManager.find(User.class, userId);
        if (existingUser != null) {
            existingUser.setUsername(updateUser.getUsername());
            existingUser.setEmail(updateUser.getEmail());
          
            entityManager.merge(existingUser);
            return "User updated successfully!";
        } else {
            return "User with ID " + userId + " not found.";
        }
	}

	

	@Override
	@Transactional
	public void cancelBooking(int bookingId) {
        Booking booking = entityManager.find(Booking.class, bookingId);
        if (booking != null) {
            entityManager.remove(booking);
        } else {
            // Handle case where booking with given ID does not exist
        }
    }
	
	@Override
	@Transactional
	public String deleteUserById(int userId) {
		
		User user = entityManager.find(User.class, userId);
        if (user != null) {
            entityManager.remove(user);
            return "User deleted successfully!";
        } else {
            return "User with ID " + userId + " not found.";
        }
	}

}
