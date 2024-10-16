package day9;

public class DemoThread {

	
	public static void main(String[] args)
	{
		Thread1 t1= new Thread1("Thread one");
		t1.start();
		
		Thread t2 = new Thread(new Thread2());
		t2.setName("Thread two");
		t2.start();
		
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		for(int i=0;i<10;i++)
		{
			System.out.println("Thread main : "+ i);
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		try {
			//Waits for a thread to die
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
	}
}
