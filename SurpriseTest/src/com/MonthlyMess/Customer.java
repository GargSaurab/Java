package com.MonthlyMess;

import java.time.LocalDate;

import static utils.CustomrUtils.EndDate;

public class Customer {
	
	
	private int custid;
	private String fname,lname,email,pwd,addr,phnNO;
	private LocalDate rDate,eDate;
	private Plan plan;
	private double fAmount;
	private static int count;
	
	public static void Static()
	{
		count=23000;
	}
	
	public Customer(String fname, String lname, String email, String pwd, String addr, String phnNO,Plan plan, double fAmount) {
		
		this.custid = ++count;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.pwd = pwd;
		this.addr = addr;
		this.phnNO = phnNO;
		this.rDate = LocalDate.now();
		this.eDate = EndDate(plan);
		this.plan = plan;
		this.fAmount = fAmount;
	}
	
	public String getPhnNO() {
		return phnNO;
	}

	public void setPhnNO(String phnNO) {
		this.phnNO = phnNO;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}



	public void setLname(String lname) {
		this.lname = lname;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public void setPwd(String pwd) {
		this.pwd = pwd;
	}



	public void setAddr(String addr) {
		this.addr = addr;
	}



	public void seteDate(LocalDate eDate) {
		this.eDate = eDate;
	}



	public void setPlan(Plan plan) {
		this.plan = plan;
	}



	public void setfAmount(double fAmount) {
		this.fAmount = fAmount;
	}



	public int getCustid() {
		return custid;
	}



	public String getFname() {
		return fname;
	}



	public String getLname() {
		return lname;
	}



	public String getEmail() {
		return email;
	}



	public String getPwd() {
		return pwd;
	}



	public String getAddr() {
		return addr;
	}



	public LocalDate getrDate() {
		return rDate;
	}

	public LocalDate geteDate() {
		return eDate;
	}



	public Plan getPlan() {
		return plan;
	}



	public double getfAmount() {
		return fAmount;
	}



	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", fname=" + fname + ", lname=" + lname + ", addr=" + addr + ", rDate="
				+ rDate + ", eDate=" + eDate + ", plan=" + plan + ", fAmount=" + fAmount + "]";
	}
	
}
