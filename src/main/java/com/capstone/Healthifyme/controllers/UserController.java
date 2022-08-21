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

import com.capstone.Healthifyme.entities.Calorie;
import com.capstone.Healthifyme.entities.Plan;
import com.capstone.Healthifyme.entities.PlanAndGoal;
import com.capstone.Healthifyme.entities.User;
import com.capstone.Healthifyme.entities.Water;
import com.capstone.Healthifyme.entities.Weight;
import com.capstone.Healthifyme.repos.CalorieRepo;
import com.capstone.Healthifyme.repos.PlanRepo;
import com.capstone.Healthifyme.repos.UserRepo;
import com.capstone.Healthifyme.repos.WaterRepo;
import com.capstone.Healthifyme.repos.WeightRepo;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
//@RequestMapping("/brillio")
public class UserController {
	@Autowired
	UserRepo userRepo;
	
	@Autowired
	PlanRepo planRepo;
	
	@Autowired
	CalorieRepo calorieRepo;
	
	@Autowired
	WaterRepo waterRepo;
	
	@Autowired
	WeightRepo weightRepo;

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
	
	@GetMapping(path = "/users/{id}/calorie")
	public List<Calorie> getUsersCalorie(@PathVariable Integer id){
		System.out.println("Getting user's Calories : ");
		User user = userRepo.findById(id).orElse(new User());
		return calorieRepo.findByUser(user);
	}
	
	@GetMapping(path = "/users/{id}/water")
	public List<Water> getUsersWater(@PathVariable Integer id){
		System.out.println("Getting user's Water : ");
		User user = userRepo.findById(id).orElse(new User());
		return waterRepo.findByUser(user);
	}
	
	@GetMapping(path = "/users/{id}/weight")
	public List<Weight> getUsersWeight(@PathVariable Integer id){
		System.out.println("Getting user's Weight : ");
		User user = userRepo.findById(id).orElse(new User());
		return weightRepo.findByUser(user);
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
	public User updateUser(@RequestBody PlanAndGoal planAndGoal, @PathVariable Integer id) {
		System.out.println("Finding plan : ");
		Plan plan = planRepo.findById(planAndGoal.getPlan_id()).orElse(new Plan());
		System.out.println("Updating user : ");
		return userRepo.findById(id).map(user_in_db -> {
			user_in_db.setPlan(plan);
			user_in_db.setWeight_goal(planAndGoal.getGoal());
			return userRepo.save(user_in_db);
		}).orElse(new User());
	}

}
