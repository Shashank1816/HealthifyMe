package com.capstone.Healthifyme.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.capstone.Healthifyme.entities.User;

public interface UserRepo extends JpaRepository<User, Integer> {

	@Query("SELECT u FROM User u WHERE u.email = ?1 and u.password = ?2")
	 public User findByEmailPass(String email,String pass);
	
	
	public User findByEmail(String email);

}
