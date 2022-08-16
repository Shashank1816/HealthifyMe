package com.capstone.Healthifyme.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capstone.Healthifyme.entities.User;

public interface UserRepo extends JpaRepository<User, Integer> {
}
