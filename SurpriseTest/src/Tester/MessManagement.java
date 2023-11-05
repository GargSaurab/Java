package Tester;

import java.util.HashMap;
import java.util.Scanner;

import com.MonthlyMess.Customer;

import CustomExc.InvalidInputExc;

import static utils.CustomrUtils.*;
import static utils.CustomerValidate.*;
import static utils.Sorting.*;
import static utils.Subamanage.*;
import static utils.IOUtils.*;

public class MessManagement {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) // put the Scanner inside so it will be automatically at end of the
													// try
		{
			System.out.println("Enter the file name:");
			String filename=sc.next();
			
			HashMap<Integer, Customer> Mess = populateMap();// Hashmap got created and values get inserted

			boolean exit = false;
			Customer cust;

			while (!exit) // puts the swtich inside loop so that if any error occur program dosen't stop
			{
				System.out.println();

				System.out.println(
						"Options: \n1.SignUp \n2.SignIn \n3.Change Password \n4.Sort "
						+ "\n5.Unsubscribe customer \n6.Display all customers details. "
					    + "\n7.Modufy Names \n8.See customers(plan ending in jan) "
					    + "\n9.Monthly customer count \n10.See Pune Customer \n11.Give discount"
					    + " \n0.EXIT");

				System.out.println("Enter the choice:");

				try {
					switch (sc.nextInt()) {
					case 1: // sign up

						System.out.println("\nEnter the \nFirst Name ,Last Name ,Email ,Password ,Address ,MObile NO."
								+ ",Plan ,Amount Paid");

						cust = detailsCheck(sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(),
								sc.nextDouble(), Mess);
						System.out.println("enter");

						Mess.put(cust.getCustid(), cust); // stores the returned object inside the Map

						System.out.println("\nData inserted");
						System.out.println(cust);
						
						store(filename,Mess);
						
						System.out.println("---Data stored----");

						break;

					case 2:// login

						System.out.println("Enter the Email:");

						cust = findAccount(sc.next(), Mess); // Checks if mail is exists and get the object in which it
																// is presentf

						System.out.println("Enter the pass word");

						validPass(sc.next(), cust);

						System.out.println("\nYou are logged in.");

						break;

					case 3:// password change

						System.out.println("Enter the Email:");

						cust = findAccount(sc.next(), Mess); // Checks if mail is exists and get the object in which it
																// is present

						System.out.println("Enter the pass word");

						validPass(sc.next(), cust);

						System.out.println("Enter the New password");

						cust.setPwd(sc.next());

						System.out.println("\nPassword Changed.");

						break;

					case 4: // sorting

						boolean flag = false;

						while (!flag) {
							System.out.println(
									"\nSorting According to: \na)First Name  \nb)Plan \nc)Date of Plan ending \ne.EXIT");

							System.out.println("Enter the Sorting order:");
							switch (sc.next()) {
							case "a":

								sortName(Mess);

								break;

							case "b":

								sortPlan(Mess);

								break;

							case "c":

								sortRdate(Mess);/*
												 * since registration date is same sorting is done on the basis of Plan
												 * ending date.
												 */

								break;

							case "e":
								System.out.println("\nExiting Sort.");
								flag = true;

								break;

							default:

								System.out.println("\nInvalid Option Please try again.");
							}

						}

						break;

					case 5:

//						System.out.println("Enter the Date:");
//						Customer Cust=Mess.values()
//							     .stream()
//							     .filter(Ct->Ct.getEmail()=="Saurab1234@gmail.com")
//							     .findAny()
//							     .orElseThrow(()-> new InvalidInputExc("No One is beyond Plan End date."));
//						  Cust.setrDate(sc.next());					
						unSub(Mess);

						break;

					case 6:

						HashMap<Integer,Customer>mess=read(filename);
						
						 mess.forEach((k,v)->System.out.println(v));

						break;

					case 7:

						// Mess=modName(Mess);
						break;

					case 8:

						dispEmails(Mess); //As I have used LocalDate.now() to get date of registration,
						                  // Thta's why I used Plan end date and Inplace of january used 
						                  // decemember.

						break;

					case 9:
						
						custCount(Mess);
						
						break;
						
					case 10:
						
						addrCust(Mess);// As record dosen't have Akurdi it will give Pune city record
						
						break;
						
					case 11:
						
						store(filename,Mess);
						 // discount(Mess);
						System.out.println("---Data stored----");
						
						break;
					case 0:

						System.out.println("\n--EXIT--");

						exit = true;

						break;

					default:

						System.out.println("\nInvalid Option Please try again.");

					}

				} catch (Exception e) {
					e.printStackTrace();
				}

			}

		}
	}

}
