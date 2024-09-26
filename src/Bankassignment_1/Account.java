package Bankassignment_1;

public class Account {
	protected String name;
	protected int accno;
	protected double balance;
	public Account(String name, int accno, double balance) {
		super();
		this.name = name;
		this.accno = accno;
		this.balance = balance;
	}
	public Account() {
		 
	}
	public void displayBalance() {
		System.out.println("User name: "+name+"\nAccount No: "+accno+"\nBalance: "+balance);
	}

}
