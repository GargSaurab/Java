package utils;

import java.util.HashMap;
import java.util.stream.Stream;

import com.MonthlyMess.Customer;

public interface Sorting {
	
	static void sortName(HashMap<Integer,Customer>Mess)
	{
		   Mess.values()
		   .stream()
		   .sorted(((cust1,cust2)->cust1.getFname().compareTo(cust2.getFname())))
		   .forEach(System.out::println);		   
	}

	static void sortPlan(HashMap<Integer,Customer>Mess)
	{
		   Mess.values()
		   .stream()
		   .sorted(((cust1,cust2)->cust1.getPlan().compareTo(cust2.getPlan())))
		   .forEach(System.out::println);		   
	}
	
	static void sortRdate(HashMap<Integer,Customer>Mess)
	{
		   Mess.values()
		   .stream()
		   .sorted(((cust1,cust2)->cust1.geteDate().compareTo(cust2.geteDate())))
		   .forEach(System.out::println);		   
	}
	
}
