package com.capstone.Healthifyme.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capstone.Healthifyme.entities.Calorie;
import com.capstone.Healthifyme.entities.User;

public interface CalorieRepo extends JpaRepository<Calorie, Integer> {
	
	public List<Calorie> findByUser(User user);
}
