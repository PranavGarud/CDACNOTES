package rivision_niks;

public  class  Saving extends Account {
	
	int trans=1;
	
	public Saving(int accid,String name,double balance)
	{
		super(accid,name,balance);
	}
	
	public void withdraw(double amount)
	{
		if(trans>3)
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
