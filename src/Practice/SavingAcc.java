package Practice;

public class SavingAcc extends Account{

	int trans;

	public SavingAcc(String name, int userID, double balance) {
		super(name, userID, balance);
		this.trans = 0;
	}
	public void withdraw(double Amount)
	{
		if(Amount < Balance && trans<3)
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
	}
	public void display()
	{
		this.toString();
	}
}
