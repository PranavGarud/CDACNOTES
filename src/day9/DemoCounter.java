package day9;

public class DemoCounter {

	public static void main(String[] args) {
		Counter c = new Counter();
		new Thread(new Runnable() {
			
			public void run() {
				//synchronized (c) {
					for(int i=0;i<100;i++)
					{
						c.increment();
						System.out.println("Count : " + c.getcount() );
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				//}
			}
		}).start();
		new Thread(new Runnable() {
			
			public void run() {
				//synchronized (c) {
					for(int i=0;i<100;i++)
					{
						c.increment();
						System.out.println("Count : " + c.getcount() );
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				//}
			}
		}).start();
	}
}
