package rivision_niks;

public class Current extends Account {
	
	int trans = 1;
	public Current(int accid,String name,double balance)
	{
		super(accid,name,balance);
	}
	public void withdraw(double amount)
	{
		if(trans>1)
		{
			
			System.out.println("trans is denied");
			
		}
		else if(amount>balance)
			System.out.println("trans is denied");
		else {
			trans = trans+1;
			balance = balance - amount;			
			System.out.println("trans Successful");
		
		}
	}
	

}
