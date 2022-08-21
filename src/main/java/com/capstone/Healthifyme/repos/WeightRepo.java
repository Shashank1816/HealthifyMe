package com.capstone.Healthifyme.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capstone.Healthifyme.entities.User;
import com.capstone.Healthifyme.entities.Weight;

public interface WeightRepo extends JpaRepository<Weight, Integer> {

	public List<Weight> findByUser(User user);
}
