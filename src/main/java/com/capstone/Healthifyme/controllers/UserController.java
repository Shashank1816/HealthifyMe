package com.capstone.Healthifyme.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.Healthifyme.entities.User;
import com.capstone.Healthifyme.repos.UserRepo;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
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

	@GetMapping(path = "/users/{id}")
	public User getUser(@PathVariable Integer id) {
		System.out.println("Getting user");
		return userRepo.findById(id).orElse(new User());
	}

	@PostMapping(path = "/login")
	public User loginUser(@RequestBody User user) {
		System.out.println("Inside login user post method");
		return userRepo.findByEmailPass(user.getEmail(), user.getPassword());
	}

	@PostMapping(path = "/users")
	public void addUser(@RequestBody User user) {
		System.out.println("Adding user : ");
		System.out.println(user);
		userRepo.save(user);
	}

	@PutMapping(path = "/users/{id}")
	public User updateUser(@RequestBody User user, @PathVariable Integer id) {
		System.out.println("Updating user : ");
		return userRepo.findById(id).map(user_in_db -> {
			user_in_db.setPlan(user.getPlan());
			return userRepo.save(user_in_db);
		}).orElse(userRepo.save(user));
	}

}
