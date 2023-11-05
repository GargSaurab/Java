package utils;

import java.time.LocalDate;
import java.util.HashMap;

import com.MonthlyMess.Customer;

import CustomExc.InvalidInputExc; 

public interface Subamanage {
	
	static void unSub(HashMap<Integer,Customer>Mess) throws InvalidInputExc
	{
	   Customer Cust= Mess.values()
	    .stream()
	    .filter(cust->cust.geteDate().isAfter(LocalDate.now()))
	    .findAny()
	    .orElseThrow(()-> new InvalidInputExc("No One is beyond Plan End date."));
	   
	    Mess.remove(Cust.getCustid());
		   
	}
	

}
 