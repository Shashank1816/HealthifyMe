package com.capstone.Healthifyme.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capstone.Healthifyme.entities.User;
import com.capstone.Healthifyme.entities.Water;

public interface WaterRepo extends JpaRepository<Water, Integer> {

	public List<Water> findByUser(User user);
}
