package com.capstone.Healthifyme.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capstone.Healthifyme.entities.Weight;

public interface WeightRepo extends JpaRepository<Weight, Integer> {

}
