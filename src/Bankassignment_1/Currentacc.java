package Bankassignment_1;

public class Currentacc extends Account {
	int trans=0;
	public Currentacc(String name, int accno, double balance) {
		super(name,accno,balance);
		trans=0;
			
		
	}
	public void withDraw(double amount) {
		if(trans>1) {
			System.out.println("Today transaction limit exceded");
		}
		if(amount>balance) {
			System.out.println("low Balance");
		}
		else if(amount<=20000) {
			balance=balance-amount;
			trans++;
			System.out.println("WithDraw Successful");
		}
	}
	public void print() {
		System.out.println("User Name: "+name+"\nAccount No: "+accno+"\nBalance: "+balance);
	}

}
