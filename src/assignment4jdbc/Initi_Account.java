package assignment4jdbc;

public class Initi_Account {

	Account a = new Account(0);
	Boolean b = false;
	
	public synchronized void Deposite(double Amount)
	{
		if(b)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		a.setBalance(a.getBalance()+Amount);
		System.out.println("After Deposite Balance : "+a.getBalance());
		b = true;
		notify();
	}
	public synchronized void Withdraw(double Amount)
	{
		if(a.getBalance()<Amount)
		{
			b = true;
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		a.setBalance(a.getBalance()-Amount);
		System.out.println("After Withdraw Balance : "+a.getBalance());
		b = false;
		notify();
	}
}
