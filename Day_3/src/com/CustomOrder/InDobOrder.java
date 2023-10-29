package com.CustomOrder;

import java.util.Comparator;

import com.Account.Core.Customer;

public class InDobOrder implements Comparator<Customer> {

	@Override
	public int compare(Customer cust1,Customer cust2)
	{
		if(cust1.getDob().isBefore(cust2.getDob()))
			return -1;
		else if(cust1.getDob().equals(cust2.getDob()))
			return 0;
		else
			return 1;
	}
	
}
