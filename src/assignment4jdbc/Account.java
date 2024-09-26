package assignment4jdbc;

public class Account  {
	private double balance;
	
	public Account(double balance) {
		this.balance = balance;
		
	}
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	public double getBalance()
	{
		return balance;
	}

}
