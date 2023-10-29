package com.Account.utils;

import java.util.ArrayList;
import java.util.List;
import static java.time.LocalDate.parse;

import com.Account.Core.Customer;
import com.Account.Core.Plan;
import com.Account.utils.CustInfoExc;

public class BankUtils {
	
	public static Customer findAccount(String Email,List<Customer>Bank) throws CustInfoExc
	{
		Customer cust=new Customer(Email);
		
		int index=Bank.indexOf(cust);
		 if(index == -1) 
		  throw new CustInfoExc("Account not exists");
		 
		  return Bank.get(index);
	}
	
	 public static void validatePassword(String Password,Customer cust1) throws CustInfoExc
	 { 
		 
		  if(!(cust1.getPassword().equals(Password)))
			  throw new CustInfoExc("Wrong Password");
		    
	}

	 public static List<Customer> populateBank()
	 {
		 List<Customer> Bank = new ArrayList<>();
		
		 Bank.add(new Customer("Saurabh","Garg","saurab5719@gmail.com","12345678",3000, parse("1999-07-05"),Plan.gold));
		 Bank.add(new Customer("Abhijeet","Pakirao","Abhijeet1001@gmail.com","12345678",30000, parse("2000-08-15"),Plan.platinum));
		 Bank.add(new Customer("Sunny","Jate","sunnyJate@gmail.com","12345678",10000, parse("2001-06-27"),Plan.silver));
		 Bank.add(new Customer("Bahskar","Gogoi","BahskarJyotiGogoi@gmail.com","12345678",100000, parse("1997-11-14"),Plan.diamond));
		 Bank.add(new Customer("Mohit","Kumar","MohitKumar@gmail.com","12345678",35000, parse("1997-09-25"),Plan.gold));
		 Bank.add(new Customer("Amit","Sharma","AmitSharma27@gmail.com","12345678",3000, parse("1998-10-27"),Plan.silver));
		 Bank.add(new Customer("Mukul","Khot","MukulKhot@gmail.com","12345678",300000, parse("1998-12-08"),Plan.platinum));
		 Bank.add(new Customer("Ankit","Rajput","AnkitRajput@gmail.com","12345678",300000, parse("2001-06-27"),Plan.platinum));
		 
		return Bank;
		
		
	 }
	 
}
