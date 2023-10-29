package com.Account.tester;

import java.util.Scanner;
import java.util.List;

import java.util.Collections;
import java.util.Comparator;

import com.Account.Core.Customer;
import com.Account.utils.ValidationRules;
import com.CustomOrder.InDobOrder;
import static com.Account.utils.ValidationRules.detailsCheck;
import static com.Account.utils.BankUtils.*;

public class BankManagement {

	public static void main(String[] args) {
	
	 try(Scanner sc=new Scanner(System.in))
	 {
		  List<Customer>Bank=populateBank();
		  
		 Customer cust;
		  
		  boolean exit=false; 
		  
		  while(!exit)
		  {
			  System.out.println("Opitons \n1. SignUp New Account: \n2.SignIn: \n3.Change Password \n4.Unsubscribe \n5.Display Details \n6.Sort the Customer List \n7.Sort Customer(Dob) \n8.Sort Customer(DOB,Last Name) \n0.EXIT");
			  
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
			        	  cust=findAccount(sc.next(),Bank); 
			        	 
			        	 System.out.println("Enter the Password:");
			        	  validatePassword(sc.next(),cust);
			        	 
			        	   System.out.println("You Are Logged in");
			   			   break;
			   			
			         case 3:           	        	   
			   		  
			        	 System.out.println("Enter the email:");
		        	  cust=findAccount(sc.next(),Bank); 
		        	 
		        	 System.out.println("Enter the Password:");
		        	  validatePassword(sc.next(),cust);
		        	  
		        	   System.out.println("Enter the New Passoword:");
		        	      cust.setPassword(sc.next());
				      
			          System.out.println("Password Changed");
			           break;
			           
		             case 4:   
			        	
		            	 System.out.println("Enter the email:");
			        	  cust=findAccount(sc.next(),Bank); 
			        	 
			        	 System.out.println("Enter the Password:");
			        	  validatePassword(sc.next(),cust);
			        	  
			        	  boolean remove=Bank.remove(cust);
			        	  
			        	  if(remove)
			        		  System.out.println("You are Unsubscribed");
			        	  
			        	  break;
			        	  
		             case 5:
		            	  
		            	 for(Customer cu: Bank)
		            	 {
		            		 System.out.println(cu);
		            	 }
			           
		            	 break;
		            	 
		            	 
		             case 6:
		            	 
		            	  Collections.sort(Bank);
		            	  
		            	  break;
		             	 
		           case 7:
		            	 
		        	     Collections.sort(Bank,new InDobOrder());
		        	     
		        	     break;
		            	  
		           case 8:
		        	   
		        	    Collections.sort(Bank,new Comparator<Customer>(){
		        	    	@Override
		        	    	public int compare(Customer cust1,Customer cust2)
		        	    	{
		        	    		int cmp=cust1.getDob().compareTo(cust2.getDob());
		        	             
		        	             if (cmp==0)
		        	             {
		        	            	return cust1.getlName().compareTo(cust2.getlName());
		        	            	
		        	             }	
		        	             return cmp;
		        	    	}
		        	    });
		        	    
		        	    break;
		             case 0:
		            	 
		            	 exit=true;
			      }
		    }
			  catch(Exception e)
			  {
				  e.printStackTrace();
			  }
		  
		  }
	   
   	 }
	}
  }
