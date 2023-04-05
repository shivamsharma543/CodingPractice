package main.java.countDownLatch;

public class ThreadEvenOdd {

	boolean odd = true;
	int MAX = 20;
	int count = 1;

	public static void main(String[] args) {

		ThreadEvenOdd obj = new ThreadEvenOdd();
		
		PrintEvenOdd object = new PrintEvenOdd();

		Thread evenThread = new Thread(new Runnable() {
			public void run() {
				object.printEven();
			}
		},"Even Thread");

		Thread oddThread = new Thread(new Runnable() {
			public void run() {
				object.printOdd();
			}
		},"Odd Thread");

		evenThread.start();
		oddThread.start();
		
		/*
		 * try { evenThread.join(); oddThread.join(); } catch (InterruptedException e) {
		 * e.printStackTrace(); }
		 */
	}
}	

class PrintEvenOdd {
	boolean odd = true;
	int MAX = 20;
	int count = 1;

	public void printEven() {
		synchronized (this) {
			while (count < MAX) {
				while (odd) {
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

				System.out.println(Thread.currentThread().getName() + "  " + count++);
				odd = true;
				notify();

			}
		}
	}

	public void printOdd() {
		synchronized (this) {
			while (count < MAX) {
				while (!odd) {
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println(Thread.currentThread().getName() + "  " + count++);
				odd = false;
				notify();
			}
		}
	}

}
