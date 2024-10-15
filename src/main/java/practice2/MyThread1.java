package practice2;

public class MyThread1 extends Thread {

	@Override

	public void run() {

		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Thread practice 1: " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {

			System.out.println(e.getMessage());
		}

	}

}