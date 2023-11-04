package utils;

import static java.time.LocalDate.parse;

import java.time.LocalDate;
import java.util.HashMap;

import com.MonthlyMess.Customer;
import com.MonthlyMess.Plan;

public interface CustomerValidate {
	
	
	 static Plan validatePlan(String plan)
	 {
		return Plan.valueOf(plan.toLowerCase());
	 }
	 
	static Customer detailsCheck(String fname, String lname, String email, String pwd, String addr, String phnNO,
			 String edate, String sPlan, double fAmount)
	{
		Plan plan=validatePlan(sPlan);
		
//		LocalDate eDate=setDate(plan);
		
		
		
		return new Customer(fname, lname, email, pwd, addr, phnNO,
				 plan,fAmount);
	}

}
