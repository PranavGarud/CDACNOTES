package day5;

public class Account {
	public int usid;
	public String name;
	public double balance;
	public int trans = 1;
	public int transd = 1;
	
	public Account(int usid,String name,double balance)
	{
		this.usid = usid;
		this.name = name;
		this.balance = balance;
	}
	public void withdraw(double amount) throws LowBalance,TransExceed,InvalidAmount{
		if(balance < amount)
		{
			throw new LowBalance("Low Balance");
		}
		if(trans>3)
		{
			throw new TransExceed("Transaction limit excced");
		}
		if(amount == 0)
		{
			throw new InvalidAmount("Invalid Amount");
		}
		balance = balance - amount;
		System.out.println("Withdraw Succesfull");
		trans++;
	}
	public void deposite(double amount) throws InvalidAmount,TransExceed
	{
		if(amount == 0)
		{
			throw new InvalidAmount("Invalid Amount");
		}
		if(transd>3)
		{
			throw new TransExceed("Transaction limit excced");
		}
		balance += amount;
		System.out.println("Deposite Succesful");
		transd++;
	}

}
