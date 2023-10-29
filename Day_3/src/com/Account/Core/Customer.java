package com.Account.Core;

import java.time.LocalDate;

public class Customer implements Comparable<Customer>{

	private int custId;
	private String fName,lName,email,password;
	private double rAmount;
	private LocalDate dob;
	private Plan sPlan;
    private static int custCount;
    private LocalDate lSubDate;
    
	
	public Customer(String fName, String lName, String email, String password, double rAmount,
			LocalDate dob, Plan sPlan,LocalDate lSubDate) {
		
		this.custId = 10012+(++custCount);
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.password = password;
		this.rAmount = rAmount;
		this.dob = dob;
		this.sPlan = sPlan;
		this.lSubDate=lSubDate;  //LocalDate.now();
	}

	public LocalDate getlSubDate() {
		return lSubDate;
	}

	public int getCustId() {
		return custId;
	}

	public String getfName() {
		return fName;
	}

	public String getlName() {
		return lName;
	}

	public String getEmail() {
		return email;
	}

	public double getrAmount() {
		return rAmount;
	}

	public Plan getsPlan() {
		return sPlan;
	}

	public static int getCustCount() {
		return custCount;
	}

	public LocalDate getDob() {
		return dob;
	}

	public Customer(String email) {
		super();
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", fName=" + fName + ", lName=" + lName + ", email=" + email
				+ ", password=" + password + ", rAmount=" + rAmount + ", dob=" + dob + ", sPlan=" + sPlan
				+ ", lSubDate=" + lSubDate + "]";
	}
	
	@Override
	 public int compareTo(Customer cust)
	 {
		return this.email.compareTo(cust.email);
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
