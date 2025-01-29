package com.bankmanagmentsystem;
import java.util.*;

public class CustomerManager {
	Customer cus1 = new  Customer("cus001","Pavan","hyderabad", "9581950211");
	Customer cus2 = new  Customer("cus002","Kumar","Telangana", "1234512345");
	Customer cus3 = new  Customer("cus003","Ravi","Andrapradesh", "5432154321");
	Customer cus4 = new  Customer("cus004","Ramesh","Telangana", "9876598765");
	Customer cus5 = new  Customer("cus005","Padma","hyderabad", "5678956789");
		
	// list for storing the users 
	public static HashSet<Customer> userList = new HashSet<Customer>();
	
	public void createDefaultCustomers() {
		userList.add(cus1);
		userList.add(cus2);
		userList.add(cus3);
		userList.add(cus4);
		userList.add(cus5);
	}
	public void displayAllCustomers() {
		Iterator<Customer> itr = userList.iterator();
		
		//displaying the userNames 
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	public void getCustomer(String customerId, String name)
	{
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
