package com.MonthlyMess;

public enum Plan {
	
	monthly (3000), quarterly (11700), halfyearly (17500), yearly (32000), ;

	private double pAmount;
	
	Plan(int pAmount) {
		this.pAmount=pAmount;
	}

	public double getpAmount() {
		return pAmount;
	}

	public void setpAmount(double pAmount) {
		this.pAmount = pAmount;
	}
	
	

}
