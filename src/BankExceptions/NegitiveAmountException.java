package BankExceptions;

public class NegitiveAmountException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NegitiveAmountException(String message)
	{
		super(message);
	}
}
