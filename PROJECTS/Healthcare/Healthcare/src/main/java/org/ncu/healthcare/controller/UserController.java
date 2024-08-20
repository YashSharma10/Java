package org.ncu.healthcare.controller;



import java.util.List;

import org.ncu.healthcare.entity.User;
import org.ncu.healthcare.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;
//    @Autowired
//    private PatientDAO patientdao;
//    @Autowired
//    private DoctorDAO doctordao;
    

    @PostMapping
    public String createUser(@RequestBody User user ) {
       
        userService.save(user); 
        
//        if ("patient".equalsIgnoreCase(user.getRole())) {
//            Patient patient = new Patient();
//            patient.setUser(user);
//            
//            patientdao.saveOrUpdatePatient(patient);
//        }
//        if ("doctor".equalsIgnoreCase(user.getRole())) {
//            Doctor doctor = new Doctor();
//            doctor.setUser(user);
//            doctor.setContactDetails("Default"); // Set the contact details
//            doctor.setQualifications("Default C");
//            doctor.setSpecialization("Default Co");
//            doctordao.saveOrUpdateDoctor(doctor);
//        }
        return "Created user endpoint";
    }
    
    @GetMapping
    public List<User> getAllUsers() {
        
        return userService.findAll();
    }
    

    @GetMapping("/{id}")
    public User getUserById(@PathVariable int userId) {
        
        return userService.findById(userId);
    }

    @PutMapping("/{id}")
    public String updateUser(@PathVariable int userId, @RequestBody User user) {
       
        userService.update(user);
        return "Update user by ID endpoint";
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable int userId) {
       
        User user = userService.findById(userId);
        if (user != null) {
            userService.delete(user);
            return "User with ID " + userId + " deleted successfully";
        } else {
            return "User with ID " + userId + " not found";
        }
    }
}
