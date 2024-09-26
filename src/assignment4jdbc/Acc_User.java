package assignment4jdbc;

public class Acc_User {
	
	public static void main(String[] args) {
	
	Initi_Account acc = new Initi_Account();

	
	Thread t2 = new Thread(new Runnable() {
		public void run()
		{
			for(int i=0;i<5;i++)
			{
				acc.Withdraw(500);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	});
	t2.start();
	
	Thread t1 = new Thread(new Runnable() {
		public void run()
		{
			for(int i=0;i<3;i++)
			{
				acc.Deposite(1000);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	});
	t1.start();
	}
			

}
