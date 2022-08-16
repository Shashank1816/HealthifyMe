package com.capstone.Healthifyme.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
=======
>>>>>>> 2c05a9b749ed17caf5c11e30161d3d10897b88ca
import org.springframework.web.bind.annotation.RestController;

import com.capstone.Healthifyme.entities.User;
import com.capstone.Healthifyme.repos.UserRepo;

@RestController
@CrossOrigin(origins="http://localhost:4200")
//@RequestMapping("/brillio")
public class UserController {
	@Autowired
	UserRepo userRepo;

	// just creating a sample program for getting all the users
	@GetMapping(path = "/users")
	public List<User> getUsers() {
		System.out.println("getting users");
		return userRepo.findAll();// we need to return user.findAll();
	}
	


//	@PostMapping(path="/users")
//	public void addUser() {
//		userRepo.save(user);
//	}
}
