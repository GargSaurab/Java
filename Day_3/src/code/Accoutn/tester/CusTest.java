package code.Accoutn.tester;

import static com.Account.utils.ValidationRules.detailsCheck;

import java.util.Scanner;

import com.Account.Core.Customer;

public class CusTest {

	public static void main(String[] args) {
		
		try(Scanner sc=new Scanner(System.in))
		{
		  System.out.println("Enter the Account Details \nFirst Name: \nLast Name: \nEmail: \nPassword: \nOpening Amount \nDate of Birth: \nPlan: ");
		  Customer cust1=detailsCheck(sc.next(),sc.next(),sc.next(),sc.next(),sc.nextDouble(),sc.next(),sc.next());  //sdf.parse checked exception
			
		  System.out.println(cust1);
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		   e.printStackTrace();
			
		}

	}

}
