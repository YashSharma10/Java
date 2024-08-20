package org.ncu.AOP.Service;

import java.util.List;

import org.ncu.AOP.Entity.User;

public interface UserService {
	String createUser(User user);

	User getUserById(int id);
	
	public List<User> getAllUsers();

	String deleteUserById(int id);
}
