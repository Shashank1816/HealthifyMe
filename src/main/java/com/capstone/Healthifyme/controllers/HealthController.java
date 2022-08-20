package com.capstone.Healthifyme.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.capstone.Healthifyme.entities.User;
import com.capstone.Healthifyme.repos.UserRepo;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class HealthController {
	@Autowired
	UserRepo userRepo;


	// just creating a sample program for getting all the users
	@GetMapping(path = "/home")
	public List<User> getUsers() {
		return userRepo.findAll();// we need to return user.findAll();
	}

}
