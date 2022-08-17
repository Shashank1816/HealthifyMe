package com.capstone.Healthifyme.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.Healthifyme.entities.Calorie;
import com.capstone.Healthifyme.entities.Water;
import com.capstone.Healthifyme.entities.Weight;
import com.capstone.Healthifyme.repos.CalorieRepo;
import com.capstone.Healthifyme.repos.WaterRepo;
import com.capstone.Healthifyme.repos.WeightRepo;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "/trackers")
public class TrackerController {
	
	@Autowired
	private CalorieRepo calorieRepo;
	
	@Autowired
	private WaterRepo waterRepo;
	
	@Autowired
	private WeightRepo weightRepo;
	
	@GetMapping(path = "")
	public void getTrackers() {
		System.out.println("Trackers endpoint");
	}
	
	@GetMapping(path = "/calorie")
	public List<Calorie> getCalorie() {
		System.out.println("Calorie endpoint");
		return calorieRepo.findAll();
	}
	
	@GetMapping(path = "/water")
	public List<Water> getWater() {
		System.out.println("Water endpoint");
		return waterRepo.findAll();
	}
	
	@GetMapping(path = "/weight")
	public List<Weight> getWeight() {
		System.out.println("Weight endpoint");
		return weightRepo.findAll();
	} 
}
