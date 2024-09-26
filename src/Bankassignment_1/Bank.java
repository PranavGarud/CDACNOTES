package Bankassignment_1;

import java.util.Scanner;

import abc_Bank.Current;

public class Bank {
	public static SavingAcc createSave() {
		int accno;
		String name;
		double balance;
		boolean check;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter name: ");
		name=s.next();
		System.out.println("Enter Account No: ");
		accno=s.nextInt();
		System.out.println("Enter Balance amm: ");
		balance=s.nextDouble();
		check=validBalance(balance,1);
		if(check=true) {
			SavingAcc sa = new SavingAcc(name,accno,balance-2000);
			sa.displayBalance();
			return sa;
		}
		System.out.println("Account not created low balance");
		return null;
		
		
	}

	private static boolean validBalance(double balance, int i) {
		 if(balance>500 && i==1) {
			 return true;
		 }
		 else if(balance>2000 && i==2) {
			 return true;
		 }
		 else if(balance>1000 && i==3) {
			 return true;
		 }
		return false;
	}
	public static void procFees()
	{
		System.out.println("1.Saving account - 500rs\n2.Loan account - 2000rs\n3.Current account - 1000rs");
		return;
	}

	public static void main(String[] args) {
		 Account ac = new Account();
//		 SavingAcc s =  createSave();
//		 s.displayBalance();
//		 s.withDraw(345);
//		 s.print();
	
//	System.out.println("Enter Data for Current Account : ");
//	Currentacc c = createCurrent();
//	c.displayBalance();
//	c.withDraw(4500);
//	c.displayBalance();
//	c.withDraw(450);
//	c.displayBalance();
//	c.print();
		 LoanAcc l = createLoan();
		 l.displayBalance();
		 l.WithDraw(490);
		 l.print();

}

	private static LoanAcc createLoan() {
		 int accno;
		 String name;
		 double balance;
		 boolean check;
		 Scanner s = new Scanner(System.in);
		 System.out.println("Enter name: ");
		 name=s.next();
		 System.out.println("Enter Account No: ");
		 accno=s.nextInt();
		 System.out.println("Enter Balance amm: ");
		 balance=s.nextDouble();
		 check=validBalance(balance,3);
		 if(check=true) {
			 LoanAcc la = new LoanAcc(name,accno,balance-1000);
			 la.displayBalance();
			 return la;
		 }
		 System.out.println("acount not create low balance");
		return null;
	}

	private static Currentacc createCurrent() {
		int accno;
		String name;
		double balance;
		boolean check;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter name: ");
		name=s.next();
		System.out.println("Enter Account No: ");
		accno=s.nextInt();
		System.out.println("Enter Balance amm: ");
		balance=s.nextDouble();
		check=validBalance(balance,2);
		if(check=true) {
			Currentacc ca = new Currentacc(name,accno,balance-2000);
			ca.displayBalance();
			return ca;
		}
		System.out.println("Account not created low balance");
		return null;
	

 
	}}
