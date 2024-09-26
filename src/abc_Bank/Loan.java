package abc_Bank;

public class Loan extends Account implements Printable{
	
	public Loan(String name,int uid,double balance)
	{
		super(name,uid,balance);
	}
	public void withdraw(double amount)
	{
		System.out.println("Withdraw Not Allowed");
	}
	public void print()
	{
		System.out.println("User Id : "+uid+"\nUser Name : "+name+"\nBalance : "+balance);
	}
}
