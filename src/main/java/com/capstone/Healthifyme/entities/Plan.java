package com.capstone.Healthifyme.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "plan")
public class Plan {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int plan_id;

	private String plan_name;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "plan", cascade = CascadeType.ALL)
	private Set<User> users;

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "diet_id")
	private Diet diet;

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "workout_id")
	private Workout workout;

	public int getPlan_id() {
		return plan_id;
	}

	public void setPlan_id(int plan_id) {
		this.plan_id = plan_id;
	}

	public String getPlan_name() {
		return plan_name;
	}

	public void setPlan_name(String plan_name) {
		this.plan_name = plan_name;
	}

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	public Diet getDiet() {
		return diet;
	}

	public void setDiet(Diet diet) {
		this.diet = diet;
	}

	public Workout getWorkout() {
		return workout;
	}

	public void setWorkout(Workout workout) {
		this.workout = workout;
	}

	@Override
	public String toString() {
		return "Plan [plan_id=" + plan_id + ", plan_name=" + plan_name + ", users=" + users + ", diet=" + diet
				+ ", workout=" + workout + "]";
	}
}
