package Bankassignment_1;

public class SavingAcc extends Account implements Printable {
	int trans=0;
	public SavingAcc(String name, int accno,double balance) {
		 super(name,accno,balance);
		 trans=0;
	}
	public void withDraw(double ammount ) {
		if(trans>3) {
			System.out.println("Transaction limit exceeded for today");
		}
		if(ammount>balance) {
			System.out.println("low balance");
		}
		else {
			balance=balance-ammount;
			trans++;
			System.out.println("Amount withdraw Succesful!!");
		}
	}
	public void print() {
		System.out.println("User Name: "+name+"\nAccount No: "+accno+"\nBalance: "+balance);
	}

}
