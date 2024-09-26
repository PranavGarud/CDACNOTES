package day5;

public class Bank {

	public static void withdraw(Account a,double amount)
	{
		try {
			a.withdraw(amount);
			}
			catch(LowBalance | InvalidAmount | TransExceed b)
			{
				System.out.println(b);
			}
	}
	public static void deposite(Account acc,double ammount)
	{
		try {
			acc.deposite(ammount);
		}
		catch(InvalidAmount | TransExceed i)
		{
			System.out.println(i);
		}
	}
	public static void main(String[] args)
	{
		Account acc = new Account(45,"Sahil",50000);
		
		withdraw(acc,600);
		withdraw(acc,600);
		withdraw(acc,600);
		withdraw(acc,600);
		
		deposite(acc,750);
		deposite(acc,750);
		deposite(acc,750);
		deposite(acc,750);
		
	}
}
