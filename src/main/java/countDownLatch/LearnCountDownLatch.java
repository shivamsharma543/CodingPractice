package main.java.countDownLatch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.stream.Collectors;


public class LearnCountDownLatch {
	CountDownLatch ct;
	List<List<Integer>> endResult = Collections.synchronizedList(new ArrayList<>());

	public static void main(String args[]) {

		System.out.println("########### Started execution of CountDownLatch #############");
		LearnCountDownLatch lt = new LearnCountDownLatch();
		lt.runSimulation(4, 2);

	}

	public void runSimulation(int numWorkers, int numberOfPartialResults) {

		ct = new CountDownLatch(4);

		System.out.println("Spawning " + numWorkers + " worker threads to compute " + numberOfPartialResults
				+ " partial results each");

		for (int i = 0; i < numWorkers; i++) {
			Thread worker = new Thread(new Worker(numberOfPartialResults, ct));
			worker.setName("Thread " + i);
			worker.start();
		}
		Thread th = new Thread(new PrintAggregateResult());
		th.start();
	}

	class Worker implements Runnable {

		int result;
		CountDownLatch ct;

		public Worker(int result, CountDownLatch ct) {
			this.result = result;
			this.ct = ct;
		}

		public void run() {
			List<Integer> ls = new ArrayList<>();
			for (int i = 0; i < result; i++) {
				ls.add(result);
			}
			System.out.println("Sum is = " + ls.stream().collect(Collectors.summingInt(Integer::intValue))
					+ " in thread " + Thread.currentThread().getName());
			endResult.add(ls);
			System.out.println("Remaining thread count before countDown method call = " + ct.getCount());
			ct.countDown();
			System.out.println("Remaining thread count after countDown method call = " + ct.getCount());

		}
	}

	class PrintAggregateResult implements Runnable {

		int sum = 0;

		@Override
		public void run() {
			try {
				ct.await();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			for (List<Integer> ls : endResult) {
				int sum1 = ls.stream().collect(Collectors.summingInt(Integer::intValue));
				sum += sum1;
			}

			System.out.println("Sum of all threads = " + sum);

		}

	}

}
