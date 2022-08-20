package com.capstone.Healthifyme.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
//
//	USER
//	id(int)(PK)
//	name(str)
//	age(int)
//	weight(int)
//	height(int)
//	activatedPlanId(int)(FK)

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int user_id;

	private String email;

	private String password;

	private String gender;

	private String name;

	private int age;

	private int weight;

	private int height;// in centimeter
	
	private int weight_goal;
	
	@ManyToOne(targetEntity = Plan.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "plan_id", referencedColumnName = "plan_id")
	private Plan plan;

	public int getWeight_goal() {
		return weight_goal;
	}

	public void setWeight_goal(int weight_goal) {
		this.weight_goal = weight_goal;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Plan getPlan() {
		return plan;
	}

	public void setPlan(Plan plan) {
		this.plan = plan;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", email=" + email + ", password=" + password + ", gender=" + gender
				+ ", name=" + name + ", age=" + age + ", weight=" + weight + ", height=" + height + ", weight_goal="
				+ weight_goal + ", plan=" + plan + "]";
	}

}
