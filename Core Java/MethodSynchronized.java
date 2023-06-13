class PrintDemo1 extends Thread {
	public void printCount() {
		for (int i = 5; i > 0; i--) {
			System.out.println("Counter --- " + i);
		}
	}

	public synchronized void run() {
		printCount();
		System.out.println("Thread " + Thread.currentThread().getName() + " exiting.");
	}
}

public class MethodSynchronized {
	public static void main(String args[]) {
		PrintDemo PD = new PrintDemo();
		Thread t1 = new Thread(PD);
		Thread t2 = new Thread(PD);
		t1.start();
		t2.start();
		// wait for threads to end
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			System.out.println("Interrupted");
		}
	}
}
