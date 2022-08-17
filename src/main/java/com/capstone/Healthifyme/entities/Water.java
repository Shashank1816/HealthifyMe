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
@Table(name = "water")
public class Water {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int water_id;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id")
	private User user;

	private int water_count;
	
	@DateTimeFormat(pattern = "dd/mm/yyyy")
	private Date date;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getWater_id() {
		return water_id;
	}

	public void setWater_id(int water_id) {
		this.water_id = water_id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getWater_count() {
		return water_count;
	}

	public void setWater_count(int water_count) {
		this.water_count = water_count;
	}

	@Override
	public String toString() {
		return "Water [water_id=" + water_id + ", user=" + user + ", water_count=" + water_count + ", date=" + date
				+ "]";
	}
}
