package com.capstone.Healthifyme.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.Healthifyme.entities.Workout;
import com.capstone.Healthifyme.repos.WorkoutRepo;


@RestController
@CrossOrigin(origins="http://localhost:4200")
public class WorkoutController {
	
	@Autowired
	WorkoutRepo workoutRepo;
	
	@GetMapping(path = "/workouts")
	public List<Workout> getDiets(){
		return workoutRepo.findAll();
	}
	
	@GetMapping(path = "/workouts/{id}")
	public Workout getDiet(@PathVariable Integer id) {
		return workoutRepo.findById(id).orElse(new Workout());
	}
}
