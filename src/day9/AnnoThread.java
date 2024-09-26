package day9;

public class AnnoThread {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
		
		public void run() {
			System.out.println("Strating a new Thread");
		}
	});
	t1.start();
	
	
	new Thread(new Runnable() {
		public void run() {
			System.out.println("Starting yet another thread");
		}
	}).start();
	
	//--------------------------------------using lambda--------------------------------------
	Runnable r = () -> System.out.println("One more thread");
	new Thread(r).start();
	
	new Thread(() ->
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Thread main : "+ i);
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	).start();
}
}
