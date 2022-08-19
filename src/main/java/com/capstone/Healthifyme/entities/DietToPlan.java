package com.capstone.Healthifyme.entities;

public class DietToPlan {
	private Integer diet_id;
	private Integer plan_id;

	@Override
	public String toString() {
		return "DietToPlan [diet_id=" + diet_id + ", plan_id=" + plan_id + "]";
	}

	public Integer getDiet_id() {
		return diet_id;
	}

	public void setDiet_id(Integer diet_id) {
		this.diet_id = diet_id;
	}

	public Integer getPlan_id() {
		return plan_id;
	}

	public void setPlan_id(Integer plan_id) {
		this.plan_id = plan_id;
	}

}
