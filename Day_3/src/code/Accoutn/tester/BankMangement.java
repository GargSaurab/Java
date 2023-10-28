package code.Accoutn.tester;

import java.util.Scanner;
import java.util.List;

import static com.Account.utils.ValidationRules.detailsCheck;

import java.util.ArrayList;

import com.Account.Core.Customer;
import com.Account.utils.ValidationRules;
import com.Account.utils.BankUtils;

public class BankMangement {

	public static void main(String[] args) {
	
	 try(Scanner sc=new Scanner(System.in))
	 {
		  List<Customer>Bank=new ArrayList<>();
		  
		  boolean exit=false; 
		  
		  while(!exit)
		  {
			  System.out.println("Opitons \n1. SignUp New Account: \n2.SignIn: \n3.Change Password \n4.Unsubscribe \n5.Display Details \n0.EXIT");
			  
			  System.out.println("Enter the Choice:");
			  
		  try{
				  switch(sc.nextInt())
			      {
			         case 1:
			        	 System.out.println("Enter the Account Details \nFirst Name: \nLast Name: \nEmail: \nPassword: \nOpening Amount \nDate of Birth: \nPlan: ");
			   		  Customer cust1=detailsCheck(sc.next(),sc.next(),sc.next(),sc.next(),sc.nextDouble(),sc.next(),sc.next(),Bank); 
			   		  
			   		  Bank.add(cust1);
			   		  
			   		  System.out.println("----Account Created----");
			   		  
			   		  break;
			   		  
			         case 2:
			        	 
			        	 System.out.println("Enter the email:");
			        	 
			        	   Customer cust=findAccount(sc.next(),Bank);
			   			
		                         	        	   
			   		 
				      
			        
			       
			      }
			  }
		  }
	   
	 }
	                                        }

                              }
