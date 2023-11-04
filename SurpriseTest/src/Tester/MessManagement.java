package Tester;

import java.util.HashMap;
import java.util.Scanner;

import com.MonthlyMess.Customer;
import static utils.CustomrUtils.populateMap;
import static utils.CustomerValidate.*;

public class MessManagement {

	public static void main(String[] args) {
		
	try(Scanner sc=new Scanner(System.in))
		{
		   HashMap<Integer,Customer>Mess=populateMap();// Hashmap got created and values get inserted
		  
		  boolean exit=false;	  
		  Customer cust;
		  
	while(!exit) 
	{	  
		  
		  System.out.println("Options: /n1.SignUp /n2.SignIn /n3.Change Password /n4.Sort /0.EXIT");
		
	      System.out.println("Enter the choice:");
	
	try {
		  switch(sc.nextInt()) 
		  {
		    case 1:
		    	
//      	    	System.out.println("To signup by email press 1 \nBy MobileNo press 2");
//      	    	
//		      	int option;
//		      	if(option==1)	
//		    	 System.out.println("Enter the Email");
//		      	
//		      	else
//		      	 System.out.println("Enter the MobileNO");
		    	
//		    	cust=detailsCheck(sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.nextDouble());
//		    	System.out.println("enter");
//		    			
//		    	Mess.put(cust.getCustid(),cust);	
		    	
		    	Mess.values()
		    	.forEach(System.out::println);
		      	
		    	break;
		    	
		    case 0:
		    	
		    	System.out.println("--EXIT--");
		    	
		    	exit=true;
		    	
	           break;	  
		          }
		  
		      }catch(Exception e)
	            {
		    	  e.printStackTrace();
	            }
		
	       }
	
		}
	}

}
