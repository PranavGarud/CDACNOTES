package rivision_niks;

public abstract class Account {
	 protected int accid;
	protected String  name;
	protected double balance;
		
	public Account(int accid,String name,double balance)
	{
		this.accid = accid;
		this.name = name;
		this.balance = balance;
		
	}
	 public void viewBalance()
	 {
		 System.out.println("Accid: " + accid +"\nName:" + name +"\nBalance:" +balance);
	 }
	 public abstract void withdraw(double amount);
	 
}
