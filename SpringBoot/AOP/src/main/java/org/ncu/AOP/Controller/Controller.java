package org.ncu.AOP.Controller;

import java.util.List;

import org.ncu.AOP.Entity.User;
import org.ncu.AOP.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class Controller {
    @Autowired
    private UserService userService;

    @PostMapping("/createUser")
    public String createUser(@RequestBody User user) {
        userService.createUser(user);
        return "User saved successfully!";
    }
    
    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable("id") int id) {
        return userService.getUserById(id);
    }

    @DeleteMapping("/user/{id}")
    public String deleteUserByID(@PathVariable("id") int id) {
        userService.deleteUserById(id);
        return "User deleted successfully!";
    }
}
