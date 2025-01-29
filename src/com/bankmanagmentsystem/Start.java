package com.bankmanagmentsystem;
import java.util.Scanner;
import userlogin.UserLoginManager;



public class Start {
	public static void main(String[] args) {
//		
//		System.out.println("1.Create new Account");
//		System.out.println("2.Deposit Money");
//		System.out.println("3.Withdraw Money");
//		System.out.println("4.exit");
//		
//		CustomerManager cm = new CustomerManager();
//		cm.createDefaultCustomers();
//		cm.displayAllCustomers();
		
		
		System.out.println("Welcome to Pavan's Bank ");
//		System.out.println("What do you want me to do today");
		System.out.println("Kindly Login First");
		UserLoginManager ulm = new UserLoginManager();
		System.out.println(ulm.getLoginDetails());
		
		
		//variable for displaying the menu
		boolean flag = false;
		int choice = 0;
		
		do {
			
			// Scanner Object for collecting the user choice
			Scanner userChoice = new Scanner(System.in);
			System.out.println("1.Deposit Money");
			System.out.println("2.Withdraw Money");
			System.out.println("3.exit");
			choice = userChoice.nextInt();
			if(choice != 3)
			{
				flag = true;
			}
			else
			{
				flag = false;
			}
		}while(flag);
			
		//userChoice.close();
	}
	
	
}
