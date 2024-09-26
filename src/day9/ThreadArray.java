package day9;

public class ThreadArray {

	public static void main(String[] args) {
		int [] arr = {41,58,35,78,25,6,7,24,58,68,99,2,4,7,5};
		ArraayPrint a = new ArraayPrint(arr);
		
		new Thread(new Runnable() {
			public void run() {
				
			}
		}).start();
		
	}
}
