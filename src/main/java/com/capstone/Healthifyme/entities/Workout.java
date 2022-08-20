package com.capstone.Healthifyme.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "workout")
public class Workout {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int workout_id;

	private String exercise1;

	private String exercise2;

	private String exercise3;

	private String exercise4;

	private String exercise5;

	private String exercise6;

	private int caloriesBurnt;

	public int getWorkout_id() {
		return workout_id;
	}

	public void setWorkout_id(int workout_id) {
		this.workout_id = workout_id;
	}

	public String getExercise1() {
		return exercise1;
	}

	public void setExercise1(String exercise1) {
		this.exercise1 = exercise1;
	}

	public String getExercise2() {
		return exercise2;
	}

	public void setExercise2(String exercise2) {
		this.exercise2 = exercise2;
	}

	public String getExercise3() {
		return exercise3;
	}

	public void setExercise3(String exercise3) {
		this.exercise3 = exercise3;
	}

	public String getExercise4() {
		return exercise4;
	}

	public void setExercise4(String exercise4) {
		this.exercise4 = exercise4;
	}

	public String getExercise5() {
		return exercise5;
	}

	public void setExercise5(String exercise5) {
		this.exercise5 = exercise5;
	}

	public String getExercise6() {
		return exercise6;
	}

	public void setExercise6(String exercise6) {
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
		return "Workout [workout_id=" + workout_id + ", exercise1=" + exercise1 + ", exercise2=" + exercise2
				+ ", exercise3=" + exercise3 + ", exercise4=" + exercise4 + ", exercise5=" + exercise5 + ", exercise6="
				+ exercise6 + ", caloriesBurnt=" + caloriesBurnt + "]";
	}

}
