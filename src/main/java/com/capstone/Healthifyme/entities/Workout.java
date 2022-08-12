package com.capstone.Healthifyme.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Workout {
	@Id
	private int id;
	private int exercise1;
	private int exercise2;
	private int exercise3;
	private int exercise4;
	private int exercise5;
	private int exercise6;
	private int caloriesBurnt;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getExercise1() {
		return exercise1;
	}

	public void setExercise1(int exercise1) {
		this.exercise1 = exercise1;
	}

	public int getExercise2() {
		return exercise2;
	}

	public void setExercise2(int exercise2) {
		this.exercise2 = exercise2;
	}

	public int getExercise3() {
		return exercise3;
	}

	public void setExercise3(int exercise3) {
		this.exercise3 = exercise3;
	}

	public int getExercise4() {
		return exercise4;
	}

	public void setExercise4(int exercise4) {
		this.exercise4 = exercise4;
	}

	public int getExercise5() {
		return exercise5;
	}

	public void setExercise5(int exercise5) {
		this.exercise5 = exercise5;
	}

	public int getExercise6() {
		return exercise6;
	}

	public void setExercise6(int exercise6) {
		this.exercise6 = exercise6;
	}

	public int getCaloriesBurnt() {
		return caloriesBurnt;
	}

	public void setCaloriesBurnt(int caloriesBurnt) {
		this.caloriesBurnt = caloriesBurnt;
	}

	@Override
	public String toString() {
		return "Workout [id=" + id + ", exercise1=" + exercise1 + ", exercise2=" + exercise2 + ", exercise3="
				+ exercise3 + ", exercise4=" + exercise4 + ", exercise5=" + exercise5 + ", exercise6=" + exercise6
				+ ", caloriesBurnt=" + caloriesBurnt + "]";
	}

}
