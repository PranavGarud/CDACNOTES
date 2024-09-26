package abc_Bank;
import java.util.Scanner;
public class Bank {
	public static boolean validBalance(double Balance, int i)
	{
		if(Balance>500 && i == 1)
		{
			return true;
		}
		else if(Balance>2000 && i == 2)
			return true;
		else if(Balance>1000 && i == 3)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void procFees()
	{
		System.out.println("1.Saving account - 500rs\n2.Loan account - 2000rs\n3.Current account - 1000rs");
		return;
	}
	public static SavingAcc  createSaving ()
	{
		int i=5,j,uid;
		String name;
		double balance;
		boolean check;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Name : ");
		name = s.next();
		System.out.println("Enter User ID : ");
		uid = s.nextInt();
		System.out.println("Enter Amount : ");
		balance = s.nextDouble(); 
		check = validBalance(balance,1);
		if(check==true)
		{
			SavingAcc acc = new SavingAcc(name,uid,balance-2000);
			acc.displayBalance();
			return acc;
		}
		System.out.println("Account not created Low balance");
		return null;
	}
	public static Current createCurrent()
	{
		int i=5,j,uid;
		String name;
		double balance;
		boolean check;
		Scanner s = new Scanner(System.in);
    	System.out.println("Enter Name : ");
		name = s.next();
		System.out.println("Enter User ID : ");
		uid = s.nextInt();
		System.out.println("Enter Amount : ");
		balance = s.nextDouble(); 
		check = validBalance(balance,2);
		if(check==true)
		{
			Current acc = new Current(name,uid,balance-2000);
			acc.displayBalance();
			return acc;
		}
		System.out.println("Account not created Low balance");
		return null;
	}
	public static Loan createLoan()
	{
		int i=5,j,uid;
		String name;
		double balance;
		boolean check;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Name : ");
		name = s.next();
		System.out.println("Enter User ID : ");
		uid = s.nextInt();
		System.out.println("Enter Amount : ");
		balance = s.nextDouble(); 
		check = validBalance(balance,3);
		if(check==true)
		{
			Loan acc = new Loan(name,uid,balance-1000);
			acc.displayBalance();
			return acc;
		}
		System.out.println("Account not created Low balance");
		return null;
	}
	public static void main(String args[])
	{
		
		Account b = new Account();
		
		/*SavingAcc s = createSaving();
		s.displayBalance();
		s.withdraw(700);
		s.withdraw(450);
		s.withdraw(100);
		s.print();*/
		
		System.out.println("Enter Data for Current Account : ");
		Current c = createCurrent();
		c.displayBalance();
		c.withdraw(4500);
		c.displayBalance();
		c.withdraw(450);
		c.displayBalance();
		c.print();
		
		/*System.out.println("Enter Data For Loan Account : ");
		Loan l = createLoan();
		l.displayBalance();
		l.withdraw(410);
		l.print();
		*/
		
	}
}
