package com.capstone.Healthifyme.entities;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "calorie")
public class Calorie {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int calorie_id;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id")
	private User user;

	private int calories;
	
	@DateTimeFormat(pattern = "dd/mm/yyyy")
	private Date date;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getCalorie_id() {
		return calorie_id;
	}

	public void setCalorie_id(int calorie_id) {
		this.calorie_id = calorie_id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	@Override
	public String toString() {
		return "Calorie [calorie_id=" + calorie_id + ", user=" + user + ", calories=" + calories + ", date=" + date
				+ "]";
	}
}
