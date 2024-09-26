package day9;

public class AccountConcurreny {

	public static void main(String[] args) {
		WihtdrawJob job = new WihtdrawJob();
		Thread t1 = new Thread(job);
		Thread t2 = new Thread(job);
		
		t1.setName("H");
		t2.setName("W");
		
		t1.start();
		t2.start();
	}
}
