package com.Account.Core;

import java.time.LocalDate;

public class Customer {

	private int custId;
	private String fName,lName,email,password;
	private double rAmount;
	private LocalDate dob;
	private Plan sPlan;
    private static int custCount;
    
	
	public Customer(String fName, String lName, String email, String password, double rAmount,
			LocalDate dob, Plan sPlan) {
		
		this.custId = 10012+(++custCount);
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.password = password;
		this.rAmount = rAmount;
		this.dob = dob;
		this.sPlan = sPlan;
	}


	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", fName=" + fName + ", lName=" + lName + ", rAmount=" + (rAmount+sPlan.getPlanCost())
				+ ", dob=" + dob + ", sPlan=" + sPlan + "]";
	}
	
	@Override
	 public boolean equals(Object anotherObj)
	 {
		System.out.println("Checking duplicate account");
		if(anotherObj instanceof Customer)
		{	
		  Customer cust=(Customer)anotherObj;
		  return this.email.equals(cust.email);
		}
		
		  return false;
	 }
}
