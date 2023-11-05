package utils;

import static java.time.LocalDate.parse;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.time.Month;

import com.MonthlyMess.Customer;
import com.MonthlyMess.Plan;

import CustomExc.InvalidInputExc;

import static utils.CustomerValidate.*;

public interface CustomrUtils {

	// List of customer got created which then populates the map
	static List<Customer> populateList() {

		List<Customer> Cust = new ArrayList<>(Arrays.asList(
				new Customer("Saurabh", "Garg", "Saurab1234@gmail.com", "12345678", "Haryana", "123456789",
						Plan.valueOf("quarterly".toLowerCase()), 5000),
				new Customer("Abhijeet", "Paikrao", "Abhijeet1234@gmail.com", "12345678", "Pune", "223456789",
						Plan.valueOf("Monthly".toLowerCase()), 3000),
				new Customer("Bhaskar", "Gogoi", "Bahskar1234@gmail.com", "12345678", "Assam", "323456789",
						Plan.valueOf("halfyearly".toLowerCase()), 8000),
				new Customer("Mohit", "Kumar", "Mohit1234@gmail.com", "12345678", "Jharkhand", "423456789",
						Plan.valueOf("quarterly".toLowerCase()), 5000),
				new Customer("Sunny", "Jate", "Sunny1234@gmail.com", "12345678", "Pune", "523456789",
						Plan.valueOf("yearly".toLowerCase()), 10000),
				new Customer("Amit", "Sharma", "Amit1234@gmail.com", "12345678", "Haryana", "623456789",
						Plan.valueOf("monthly".toLowerCase()), 5000),
				new Customer("Ankit", "Rajput", "Ankit1234@gmail.com", "12345678", "Haryana", "723456789",
						Plan.valueOf("quarterly".toLowerCase()), 5000)));
		return Cust;
	}

	// Hashmap got created in which data got stored via list
	static HashMap<Integer, Customer> populateMap() {

		List<Customer> Custlist = populateList();
		Map<Integer, Customer> mess = Custlist.stream().collect(Collectors.toMap(Customer::getCustid, cust -> cust));

		HashMap<Integer, Customer> Mess = new HashMap<>(mess);

		return Mess;
	}

	// Set the Plan End Date as per the Plan
	static LocalDate EndDate(Plan plan) {

		if (plan == (Plan.monthly)) {
			LocalDate Date = LocalDate.now().plusMonths(1);
			return Date;
		}

		if (plan == (Plan.quarterly)) {
			LocalDate Date = LocalDate.now().plusMonths(3);
			return Date;
		}

		if (plan == (Plan.halfyearly)) {
			LocalDate Date = LocalDate.now().plusMonths(6);
			return Date;
		}

		if (plan == (Plan.yearly)) {
			LocalDate Date = LocalDate.now().plusMonths(12);
			return Date;
		}

		return LocalDate.now();

	}

	// find id account is in the map or not if exists returns the customer object
	static Customer findAccount(String email, HashMap<Integer, Customer> Mess) throws InvalidInputExc {
		// Customer cust=new Customer(email);

		Customer Cust = Mess.values().stream().filter(cust -> cust.getEmail().equals(email)).findAny()
				.orElseThrow(() -> new InvalidInputExc("No such account exists."));

		return Cust;
	}

	static void validPass(String pass, Customer cust) throws InvalidInputExc {
		if (!cust.getPwd().equals(pass))
			throw new InvalidInputExc("Invalis Password");
	}

	static void modName(HashMap<Integer, Customer> Mess) {
//		   Map<Integer, Customer>mess= Mess.values()
//		   .stream()
//		   .collect(Collectors.toMap(cust->cust.getCustid(),cust->cust.getFname().substring(0, 1).toUpperCase()+cust.getFname().substring(1).toLowerCase()));
//		  
//		   HashMap<Integer,Customer>MESS=new HashMap<>(mess);
		Customer cust;

	}

	static void dispEmails(HashMap<Integer, Customer> Mess) {
		Mess.values().stream().filter(cust -> (cust.geteDate().getMonth()) == Month.DECEMBER)
				.forEach(System.out::println);
	}

	static void custCount(HashMap<Integer, Customer> Mess) {
		long count = Mess.values().stream().filter(cust -> cust.getPlan() == Plan.monthly).count();

		System.out.println("\nMonthly Customer: " + count);

	}

	static void addrCust(HashMap<Integer,Customer>Mess)
	   {
		   Mess.values()
		   .stream()
		   .filter(cust->cust.getAddr().equals("Pune"))
		   .forEach(System.out::println);		   
	   }

//	static void discount(HashMap<Integer,Customer>Mess)
//	{
//		Mess.values()
//		.stream()
//		.filter(
//				
//				)
		
//	}
	
}
