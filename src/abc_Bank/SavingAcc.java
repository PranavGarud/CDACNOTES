package abc_Bank;

public class SavingAcc extends Account implements Printable{
	int tran = 0;
	
	public SavingAcc(String name,int uid,double balance)
	{
		super(name,uid,balance);
		tran = 0;
	}
	public void withdraw(double amount)
	{
		if(tran>3)
		{
			System.out.println("Exceeded Maximum transaction limit of the day");
		}
		if(amount>balance)
		{
			System.out.println("Low Balance");
		}
		else
		{
			balance = balance-amount;
			tran++;
			System.out.println("Withdraw Succesful");
		}
	}
	public void print()
	{
		System.out.println("User Id : "+uid+"\nUser Name : "+name+"\nBalance : "+balance);
	}

}
