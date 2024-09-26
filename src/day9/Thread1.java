package day9;

public class Thread1 extends Thread{

	String name;
	public Thread1(String name)
	{
		this.name = name;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//System.out.println(Thread.currentThread().getName());
		for(int i=0;i<10;i++)
		{
			System.out.println(name + " : " +i);
			try {
			Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}

	
}
