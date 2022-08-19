package com.capstone.Healthifyme.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.Healthifyme.entities.PaymentRequest;
import com.capstone.Healthifyme.entities.Plan;
import com.capstone.Healthifyme.entities.User;
import com.capstone.Healthifyme.repos.PlanRepo;
import com.capstone.Healthifyme.repos.UserRepo;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class PlanController {
	
	@Autowired
	PlanRepo planRepo;
	
	@Autowired
	UserRepo userRepo;
	
	@GetMapping(path = "/plans")
	public List<Plan> getPlans(){
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

}
