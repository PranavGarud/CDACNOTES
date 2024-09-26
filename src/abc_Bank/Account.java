package abc_Bank;

public class Account {

	protected String name;
	protected int uid;
	protected double balance;
	
	public Account()
	{
		
	}
	public Account(String name,int uid,double balance)
	{
		this.name = name;
		this.uid = uid;
		this.balance = balance;
	}
	public void displayBalance()
	{
		System.out.println("User Id : "+uid+"\nUser Name : "+name+"\nBalance : "+balance);
	}
	
}
