package Practice;

public class CurrentAcc extends Account{

	int trans;
	public CurrentAcc(String name, int userID, double balance) {
		super(name, userID, balance);
		this.trans = 0;
	}
	public void withdraw(double Amount)
	{
		if(Amount < Balance && trans<1 && Amount < 20000)
		{
			Balance -= Amount;
			trans++;
			System.out.println("Withdraw Succesfull");
		}
		else if(Amount > Balance)
		{
			System.out.println("Insufficient Balance");
		}
		else if(trans == 3)
		{
			System.out.println("Transaction limit exceed");
		}
		else if(Amount<20000)
		{
			System.out.println("20000 limit exceed");
		}
	}
	public void display()
	{
		this.toString();
	}

}
