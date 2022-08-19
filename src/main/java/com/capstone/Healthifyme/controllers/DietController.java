package com.capstone.Healthifyme.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.Healthifyme.entities.Diet;
import com.capstone.Healthifyme.repos.DietRepo;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class DietController {
	
	@Autowired
	DietRepo dietRepo;
	
	@GetMapping(path = "/diets")
	public List<Diet> getDiets(){
		return dietRepo.findAll();
	}
	
	@GetMapping(path = "/diets/{id}")
	public Diet getDiet(@PathVariable Integer id) {
		return dietRepo.findById(id).orElse(new Diet());
	}
}
