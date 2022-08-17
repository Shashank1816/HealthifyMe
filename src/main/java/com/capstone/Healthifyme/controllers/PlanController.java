package com.capstone.Healthifyme.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.Healthifyme.entities.Plan;
import com.capstone.Healthifyme.repos.PlanRepo;

@RestController
public class PlanController {
	
	@Autowired
	PlanRepo planRepo;
	
	@GetMapping(path = "/plans")
	public List<Plan> getPlans(){
		return planRepo.findAll();
	}

}
