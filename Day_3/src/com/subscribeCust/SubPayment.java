package com.subscribeCust;

import java.util.List;
import java.util.ArrayList;
import java.time.Period;
import java.time.LocalDate;
import java.util.Iterator;

import com.Account.Core.Customer;

public class SubPayment {
	
 public static List<Customer> pendPayment(int duration,List<Customer>Bank)
 {
	 List<Customer>pcust=new ArrayList<>();
	 
	 for(Customer cust:Bank)
	 {
		 if(Period.between(cust.getlSubDate(),LocalDate.now()).toTotalMonths()>duration)
			 pcust.add(cust);
	 }
	 
	return pcust; 
 }

 public static List<Customer> DCustomer(int duration,List<Customer>Bank)
 {
	 List<Customer>pcust=new ArrayList<>();
	   
	  Iterator<Customer>custItr=Bank.iterator();
	  
	 while(custItr.hasNext())
	 {
		 
		 Customer cust=custItr.next();
		 
		 if(Period.between(cust.getlSubDate(),LocalDate.now()).toTotalMonths()>duration)
		 {
			 System.out.println("Name:"+cust.getfName()+" "+cust.getlName()+"  LastSubscriptionDate:"+cust.getlSubDate()+"\n---REMOVED---");
			  custItr.remove();
		 }   
	 }
	 
	return pcust; 
 }
 
 
}
