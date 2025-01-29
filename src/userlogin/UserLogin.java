package userlogin;

public class UserLogin {

	private String userName;
	private int pin;
	
	public UserLogin(String userName, int pin)
	{
		this.userName = userName;
		this.pin = pin;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getPin() {
		return this.pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}
	
	
}
