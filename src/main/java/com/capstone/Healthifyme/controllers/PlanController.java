package com.capstone.Healthifyme.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.Healthifyme.entities.Plan;
import com.capstone.Healthifyme.repos.PlanRepo;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class PlanController {
	
	@Autowired
	PlanRepo planRepo;
	
	@GetMapping(path = "/plans")
	public List<Plan> getPlans(){
		return planRepo.findAll();
	}
	
	@PostMapping(path="/plans")
	public void addUser(@RequestBody Plan plan) {
		System.out.println("Adding Plan : ");
		System.out.println(plan);
		planRepo.save(plan);
	}

}
