package com.capstone.Healthifyme.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	public String getTrackers() {
		System.out.println("Trackers endpoint");
		return "Nothing to show here";
	}
	
	@GetMapping(path = "/calorie")
	public List<Calorie> getCalorie() {
		System.out.println("Calorie endpoint");
		return calorieRepo.findAll();
	}
	
//	@PostMapping(path = "/calorie")
//	public Calorie addCalorie(@RequestBody Calorie calorie) {
//		System.out.println("Adding Calorie");
//		return calorieRepo.save(calorie);
//	}
	
	@GetMapping(path = "/water")
	public List<Water> getWater() {
		System.out.println("Water endpoint");
		return waterRepo.findAll();
	}
	
//	@PostMapping(path = "/water")
//	public Water addWater(@RequestBody Water water) {
//		System.out.println("Adding Water");
//		return waterRepo.save(water);
//	}
	
	@GetMapping(path = "/weight")
	public List<Weight> getWeight() {
		System.out.println("Weight endpoint");
		return weightRepo.findAll();
	}
	
//	@PostMapping(path = "/weight")
//	public Weight addWeight(@RequestBody Weight weight) {
//		System.out.println("Adding Weight");
//		return weightRepo.save(weight);
//	}
}
