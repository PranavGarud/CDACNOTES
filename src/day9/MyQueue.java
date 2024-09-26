package day9;

public class MyQueue {

	int val = 0;
	boolean hasvalue;
	//String val;
	
	/*public MyQueue(String val) {
		this.val =  val;
	}*/
	public synchronized void setValue(int val)
	{
		if(hasvalue)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
		System.out.println("Set value : "+val);
		this.val = val;
		hasvalue = true;
		notify();
	}
	public synchronized void getValue()
	{
		if(!hasvalue)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Got value : "+val);
		hasvalue = false;
		notify();
	}
}
