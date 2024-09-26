package day9;

public class ProdConsProblem {

	public static void main(String[] args) {
		
		MyQueue queue = new MyQueue();

		Thread producer = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 10; i++) {
					queue.setValue(i);
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		Thread consumer = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 10; i++) {
					queue.getValue();
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		
		producer.start();
		consumer.start();
	}
}
