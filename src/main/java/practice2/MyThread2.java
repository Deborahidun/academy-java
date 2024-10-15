package practice2;

public class MyThread2 extends Thread {

	@Override
	public void run() {

		try {
			for (int i = 1; i <= 5; i++) {

				System.out.println("Thread practice: " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}

	}
}