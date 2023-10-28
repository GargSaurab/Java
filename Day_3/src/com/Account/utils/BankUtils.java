package com.Account.utils;

import java.util.List;

import com.Account.Core.Customer;
import com.Account.utils.CustInfoExc;

public class BankUtils {
	
	public Customer findAccount(String Email,List<Customer>Bank) throws CustInfoExc
	{
		Customer cust=new Customer(Email);
		
		int index=Bank.indexOf(cust);
		 if(index == -1) 
		  throw new CustInfoExc("Account not exists");
		 
		  System.out.println(Bank.get(index));
		  
		  return cust;
	
	}

}
