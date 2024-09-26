package abc_Bank;

public class Current extends Account implements Printable {
	int tran = 0;
	public Current(String name,int uid,double balance)
	{
		super(name,uid,balance);
		tran = 0;
	}
	public void withdraw(double amount)
	{
		if(tran>1)
		{
			System.out.println("Exceeded Maximum transaction limit of the day");
		}
		if(amount>balance)
		{
			System.out.println("Low Balance");
		}
		else if(amount<=20000)
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
