package com.capstone.Healthifyme.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capstone.Healthifyme.entities.Calorie;

public interface CalorieRepo extends JpaRepository<Calorie, Integer> {

}
