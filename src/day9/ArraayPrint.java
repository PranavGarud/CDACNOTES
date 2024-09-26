package day9;

public class ArraayPrint implements Runnable{

	int[] arr ;
	
	public ArraayPrint(int[] arr) {
		super();
		this.arr = arr;
	}
		
	public void run() {
		print();
	}
	
	public void print() {
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
