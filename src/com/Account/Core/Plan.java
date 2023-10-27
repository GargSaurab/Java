package com.Account.Core;

public enum Plan {
 
	silver(1000),gold(2000),diamond(5000),platinum(10000);

	private double planCost;

	private Plan(double planCost) {
		this.planCost = planCost;
	}

	public double getPlanCost() {
		return planCost;
	}

}
