package org.ncu.movie_app_v1.DAO;

import java.util.List;

import org.ncu.movie_app_v1.Entity.User;

public interface UserDao {
	
	public String saveUser(User user);
	 User getUserById(int userId);
	 List<User> getAllUsers();
	 public String updateUserById(int userId, User updateUser);
	 public void cancelBooking(int bookingId);
	 public String deleteUserById(int userId);
	
	

}
