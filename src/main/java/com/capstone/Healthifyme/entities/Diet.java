package com.capstone.Healthifyme.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "diet")
public class Diet {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int diet_id;

	private String breakfast;

	private String lunch;

	private String dinner;

	private String calorieIntake;

	private int protein;

	private int fat;

	private int carb;

	public int getDiet_id() {
		return diet_id;
	}

	public void setDiet_id(int diet_id) {
		this.diet_id = diet_id;
	}

	public String getBreakfast() {
		return breakfast;
	}

	public void setBreakfast(String breakfast) {
		this.breakfast = breakfast;
	}

	public String getLunch() {
		return lunch;
	}

	public void setLunch(String lunch) {
		this.lunch = lunch;
	}

	public String getDinner() {
		return dinner;
	}

	public void setDinner(String dinner) {
		this.dinner = dinner;
	}

	public String getCalorieIntake() {
		return calorieIntake;
	}

	public void setCalorieIntake(String calorieIntake) {
		this.calorieIntake = calorieIntake;
	}

	public int getProtein() {
		return protein;
	}

	public void setProtein(int protein) {
		this.protein = protein;
	}

	public int getFat() {
		return fat;
	}

	public void setFat(int fat) {
		this.fat = fat;
	}

	public int getCarb() {
		return carb;
	}

	public void setCarb(int carb) {
		this.carb = carb;
	}
}
