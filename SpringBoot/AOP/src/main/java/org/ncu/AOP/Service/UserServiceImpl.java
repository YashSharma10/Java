package org.ncu.AOP.Service;

import java.util.List;

import org.ncu.AOP.Dao.UserDao;
import org.ncu.AOP.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserDao userDao;
	
	@Override
	public String createUser(User user) {
		this.userDao.createUser(user);
        return "User save successfully!!!";
	}
	
	@Override
	public List<User> getAllUsers() {
		return userDao.getAllUsers();
	}

	@Override
	public User getUserById(int id) {
		return userDao.getUserById(id);
	}

	@Override
	public String deleteUserById(int id) {
		this.userDao.deleteUserById(id);
		 return "User Deleted successfully!!!";
	}

	

}
