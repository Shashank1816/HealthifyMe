package com.capstone.Healthifyme.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.Healthifyme.entities.Diet;
import com.capstone.Healthifyme.entities.DietToPlan;
import com.capstone.Healthifyme.entities.PaymentRequest;
import com.capstone.Healthifyme.entities.Plan;
import com.capstone.Healthifyme.entities.User;
<<<<<<< HEAD
import com.capstone.Healthifyme.entities.Workout;
import com.capstone.Healthifyme.entities.WorkoutToPlan;
=======
import com.capstone.Healthifyme.repos.DietRepo;
>>>>>>> 324acaa41ac826470f8199e8f86711dc239d4ae9
import com.capstone.Healthifyme.repos.PlanRepo;
import com.capstone.Healthifyme.repos.UserRepo;
import com.capstone.Healthifyme.repos.WorkoutRepo;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PlanController {

	@Autowired
	PlanRepo planRepo;

	@Autowired
	UserRepo userRepo;

	
	@Autowired
	WorkoutRepo workoutRepo;


	@Autowired
	DietRepo dietRepo;


	@GetMapping(path = "/plans")
	public List<Plan> getPlans() {
		return planRepo.findAll();
	}

	@PostMapping(path = "/buyplan")
	public String buyPlan(@RequestBody PaymentRequest paymentRequest) {
		try {
			User user = userRepo.findByEmail(paymentRequest.getUserEmail());
			Plan plan = planRepo.findById(paymentRequest.getPlan_id()).orElse(new Plan());
			user.setPlan(plan);
			userRepo.save(user);
			return "Successfull";
		} catch (Exception e) {
			// TODO: handle exception
			return "Unsuccessfull";
		}

	}

	@PostMapping(path = "/plans/addDietToPlan")
	public String addDietToPlan(@RequestBody DietToPlan dietToPlan) {
		try {
			Diet diet = dietRepo.findById(dietToPlan.getDiet_id()).orElse(new Diet());
			Plan plan = planRepo.findById(dietToPlan.getPlan_id()).orElse(new Plan());
			plan.setDiet(diet);
			planRepo.save(plan);
			return "Successfull";
		} catch (Exception e) {
			// TODO: handle exception
			return "Unsuccessfull";
		}

	}
	
	
	@PostMapping(path = "/plans/addWorkoutToPlan")
	public String addWorkoutToPlan(@RequestBody WorkoutToPlan workoutToPlan) {
		try {
			Workout workout = workoutRepo.findById(workoutToPlan.getWorkoutId()).orElse(new Workout());
			Plan plan = planRepo.findById(workoutToPlan.getPlanId()).orElse(new Plan());
			plan.setWorkout(workout);
			planRepo.save(plan);
			return "Successfull";
		} catch (Exception e) {
			// TODO: handle exception
			return "Unsuccessfull";
		}
	}

}
