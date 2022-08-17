package com.capstone.Healthifyme.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int user_id;

	private String email;

	private String password;

	private String gender;

	private String name;

	private int age;

	private int weight;

	private int height;// in centimeter

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "plan_id")
	private Plan plan;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<Calorie> calorietrackers;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<Water> watertrackers;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<Weight> weighttrackers;

	public Set<Calorie> getCalorietrackers() {
		return calorietrackers;
	}

	public void setCalorietrackers(Set<Calorie> calorietrackers) {
		this.calorietrackers = calorietrackers;
	}

	public Set<Water> getWatertrackers() {
		return watertrackers;
	}

	public void setWatertrackers(Set<Water> watertrackers) {
		this.watertrackers = watertrackers;
	}

	public Set<Weight> getWeighttrackers() {
		return weighttrackers;
	}

	public void setWeighttrackers(Set<Weight> weighttrackers) {
		this.weighttrackers = weighttrackers;
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

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", email=" + email + ", password=" + password + ", gender=" + gender
				+ ", name=" + name + ", age=" + age + ", weight=" + weight + ", height=" + height + ", plan=" + plan
				+ ", calorietrackers=" + calorietrackers + ", watertrackers=" + watertrackers + ", weighttrackers="
				+ weighttrackers + "]";
	}

}
