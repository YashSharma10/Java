package org.ncu.AOP.Dao;

import java.util.List;

import org.ncu.AOP.Entity.User;

public interface UserDao {
	
	String createUser(User user);

	User getUserById(int id);
	
	public List<User> getAllUsers();

	String deleteUserById(int id);
}
