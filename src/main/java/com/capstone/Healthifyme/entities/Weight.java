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
@Table(name = "weight")
public class Weight {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int weight_id;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id")
	private User user;

	private int weight;

	@DateTimeFormat(pattern = "dd/mm/yyyy")
	private Date date;

	public int getWeight_id() {
		return weight_id;
	}

	public void setWeight_id(int weight_id) {
		this.weight_id = weight_id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Weight [weight_id=" + weight_id + ", user=" + user + ", weight=" + weight + ", date=" + date + "]";
	}
}
