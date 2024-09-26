package day9;

public class WihtdrawJob implements Runnable {

	Account acc = new Account(10000);
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			whithdraw(2000);
		}
	}
	public synchronized void whithdraw(int amount)
	{
		if(acc.getBalance() >= amount)
		{
			System.out.println(Thread.currentThread().getName() + " is ready to withdraw");
			System.out.println(Thread.currentThread().getName() + " is going to sleep");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " is waking up");
			acc.whithdraw(amount);
			System.out.println(Thread.currentThread().getName() + "Withdrawal Successfully");
			System.out.println("Balance : " + acc.getBalance());
		}
		else
		{
			System.out.println(Thread.currentThread().getName() + " doesnt have enough balance");
		}
	}
}
