package utils;

import static java.time.LocalDate.parse;

import java.util.HashMap;

import com.MonthlyMess.Customer;
import com.MonthlyMess.Plan;

import CustomExc.InvalidInputExc;

public interface CustomerValidate {

	// Validating the Plan that user put right plan or not
	static Plan validatePlan(String plan) throws IllegalArgumentException 
	{
		return Plan.valueOf(plan.toLowerCase());

	}

	// Checking if user input valid email and if email already exist or not
	static void checkMail(String email, HashMap<Integer, Customer> Mess) throws InvalidInputExc {
		String pattern = "[A-Z0-9a-z._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}";

		if (!email.matches(pattern))
			throw new InvalidInputExc("Invalid Email."); // checked if email is valid or not

		Customer cust = new Customer(email);

		if ((Mess.containsValue(cust))) // checked if email already exists or not in record
			throw new InvalidInputExc("This Email is already in use.");

	}

	// Validating PhnNo that it consists 10 digits or not
	static void validatePhnNO(String phno) throws InvalidInputExc {
		String pattern = "^[0-9]{10}$";

		if (!phno.matches(pattern))
			throw new InvalidInputExc("Invalid PhnNO.");

	}

	// Validating if user Paying valid amount according to plan
	static void validatefAmount(double fAmount, Plan plan) throws InvalidInputExc {

		if ((plan.getpAmount() > fAmount))
			throw new InvalidInputExc("Insufficient Amount for the Choosen Plan.");
	}

	// Validating all the Details input by user.
	static Customer detailsCheck(String fname, String lname, String email, String pwd, String addr, String phnNO,
			String sPlan, double fAmount, HashMap<Integer, Customer> Mess)
			throws IllegalArgumentException, InvalidInputExc {

		checkMail(email, Mess);

		validatePhnNO(phnNO);
		
		Plan plan = validatePlan(sPlan);

		validatefAmount(fAmount, plan);

		return new Customer(fname, lname, email, pwd, addr, phnNO, plan, fAmount);
	}

}
