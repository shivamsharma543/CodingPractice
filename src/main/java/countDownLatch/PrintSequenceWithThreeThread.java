package main.java.countDownLatch;

import java.util.concurrent.ForkJoinPool;

public class PrintSequenceWithThreeThread extends Thread {

	int remainder;

	public static void main(String[] args) {

		PrintSequenceWithThreeThread obj = new PrintSequenceWithThreeThread();

		ThreadSample obj1 = new ThreadSample(1 ,obj);
		ThreadSample obj2 = new ThreadSample(2,obj);
		ThreadSample obj3 = new ThreadSample(0,obj);
		
		Thread t1 = new Thread(obj1,"First Thread");
		Thread t2 = new Thread(obj2,"Second Thread");
		Thread t3 = new Thread(obj3,"Thrid Thread");
		
		t1.start();
		t2.start();
		t3.start();		

 }
	
}

class ThreadSample implements Runnable{
	
	int remainder;
	static int number = 1;
	PrintSequenceWithThreeThread obj;
	
	
	
	public ThreadSample(int remainder ,PrintSequenceWithThreeThread obj ) {
		this.obj = obj;
		this.remainder = remainder;
	}

	@Override
	public void run() {
		while(number<20-1) {
		synchronized(obj) {
			System.out.println("number = "+ number + "  with current thread ->"+ Thread.currentThread().getName()+ ", remainder = "+ remainder);
			while(number%3 != remainder) {
				 try {
					 obj.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			System.out.println(Thread.currentThread().getName()+ "  "+ number++);
			obj.notifyAll();
		}
		}
		
	}
	
	
}

/*
 * class ThreadSample implements Runnable {
 * 
 * static int num = 1; int remainder; static Object lock = new Object();
 * 
 * public ThreadSample(int remainder) { this.remainder = remainder; }
 * 
 * public void run() { while (num < 20) { synchronized (lock) { while (num % 3
 * != remainder) { try { lock.wait(); } catch (InterruptedException e) { // TODO
 * Auto-generated catch block e.printStackTrace(); } }
 * System.out.println("Thread name " + Thread.currentThread().getName() + " " +
 * num++); lock.notifyAll(); } }
 * 
 * }
 * 
 * }
 */