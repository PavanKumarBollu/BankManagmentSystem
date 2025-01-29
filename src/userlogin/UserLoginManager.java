package userlogin;

import java.util.ArrayList;

import java.util.Scanner;

public class UserLoginManager {
	
	// default Users Credentials to login into the page
	
	UserLogin user1 = new UserLogin("pavan", 1111);
	UserLogin user2 = new UserLogin("kumar", 2222);
	UserLogin user3 = new UserLogin("ravi", 3333);
	UserLogin user4 = new UserLogin("ramesh", 4444);
	UserLogin user5 = new UserLogin("padma", 5555);
	
	ArrayList<UserLogin> users = new ArrayList<UserLogin>();
	
	public UserLoginManager()
	{
		//adding all the default users to the list
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		users.add(user5);
		//System.out.println(users);
	}
	
	@SuppressWarnings("resource")
	public boolean getLoginDetails()
	{

		Scanner sc = new Scanner(System.in);
		String userName = "";
		int pin = 0;
		boolean result = false; 
		//System.out.println(result);
		
		try 
		{
			System.out.println("Enter Your userName");
			userName = sc.next();
			System.out.println("Enter Your Pin");
			pin = sc.nextInt();
//			sc.close();
			if(!verifyUser(userName, pin))
			{
				throw new Exception("Wrong Creadintials Try Again");
			}else
			{
				result = true;
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			try {
				System.out.println("Enter Your userName");
				userName = sc.next();
				System.out.println("Enter Your Pin");
				pin = sc.nextInt();
//				sc.close();
				if(!verifyUser(userName, pin))
				{
					throw new Exception("Wrong Creadintials Try Again");
				}else
				{
					result = true;
				}
			} catch (Exception e2) {
				System.out.println(e2.getMessage());
				try {
					System.out.println("Enter Your userName");
					userName = sc.next();
					System.out.println("Enter Your Pin");
					pin = sc.nextInt();
//					sc.close();
					if(!verifyUser(userName, pin))
					{
						sc.close();
						throw new Exception("Your chances are over to login");
					}else
					{
						result = true;
					}
				} catch (Exception e3) {
					System.out.println(e3.getMessage());
					
					System.exit(0);
				}
			}
		}	
		
		
		sc.close();
		return result;
	}
	
	
	public boolean verifyUser(String userName, int pin)
	{
		for(UserLogin u : users)
		{
//			System.out.println(u.getUserName());;
//			System.out.println(u.getPin());
			if (u.getUserName().equals(userName) && u.getPin() == pin) {
//				System.out.println("hai");
				return true;
			}
		}
		
		return users.contains(new UserLogin(userName, pin));
	}

}
