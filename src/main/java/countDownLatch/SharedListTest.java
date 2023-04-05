package main.java.countDownLatch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class SharedListTest {

	static final int READER_SIZE = 10;
    static final int WRITER_SIZE = 2;
    
	public static void main(String[] args) {
 
	        Integer[] initialElements = {};
	 
	        SharedList<Integer> sharedList = new SharedList<>(initialElements);

	        for (int i = 0; i < WRITER_SIZE; i++) {
	            new WriteThread(sharedList).start();
	        }
	        for (int i = 0; i < READER_SIZE; i++) {
	            new ReadThread(sharedList).start();
	        }		 

	}

}

class SharedList<E> {

	ReadWriteLock lock = new ReentrantReadWriteLock();

	List<E> ls = new ArrayList<E>();

	public SharedList(E[] arr) {
		ls.addAll(Arrays.asList(arr));
	}

	public void addElemant(E e) {
		Lock writeLock = lock.writeLock();
		writeLock.lock();
		
		try {
			ls.add(e);
		} finally {
			writeLock.unlock();
		}

	}

	public E getElemant(int i) {
		Lock readLock = lock.readLock();
		readLock.lock();
		try {
			return ls.get(i);
		} finally {
			readLock.unlock();
		}
	}

	public int getSize() {
		Lock readLock = lock.readLock();
		readLock.lock();
		try {
			return ls.size();
		} finally {
			readLock.unlock();
		}
	}
}

class WriteThread extends Thread {
	SharedList<Integer> obj;

	public WriteThread(SharedList<Integer> obj) {
		super();
		this.obj = obj;
	}

	public void run() {
		Random random = new Random();
		int e = random.nextInt(100);
		obj.addElemant(e);
		
		try {
			
			System.out.println("value which is being add:  "+ e+"  " +Thread.currentThread().getName());
			Thread.sleep(200);
			
		  } catch (InterruptedException e1) { // TODO Auto-generated catch block
		  e1.printStackTrace(); }
		 
	}

}

class ReadThread extends Thread {
	
	SharedList<Integer> obj;

	public ReadThread(SharedList<Integer> obj) {
		super();
		this.obj = obj;
	}

	public void run() {
		Random random = new Random();
		int i = random.nextInt(obj.getSize());		
		int e = obj.getElemant(i);
		/*try {
			Thread.sleep(100);*/
			System.out.println("value which is being read:  "+ e+"   "+Thread.currentThread().getName());
		
		/*
		 * } catch (InterruptedException ex) { // TODO Auto-generated catch block
		 * ex.printStackTrace(); }
		 */
		 
	}
}