package day9;

public class Account {

	private int balance;
	public Account(int balance)
	{
		this.balance = balance;
	}
	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void whithdraw(int amount)
	{
		balance = balance - amount;
	}
}
