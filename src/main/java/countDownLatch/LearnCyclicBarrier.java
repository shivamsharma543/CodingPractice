package main.java.countDownLatch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LearnCyclicBarrier {

	CyclicBarrier ct;
	List<List<Integer>> endResult = Collections.synchronizedList(new ArrayList<>());

	public static void main(String args[]) {
		LearnCyclicBarrier lt = new LearnCyclicBarrier();
		lt.runSimulation(4, 2);
	}

	public void runSimulation(int numWorkers, int numberOfPartialResults) {
		ct = new CyclicBarrier(4, new PrintAggregateResult());
		System.out.println("Spawning " + numWorkers + " worker threads to compute " + numberOfPartialResults
				+ " partial results each");

		for (int i = 0; i < numWorkers; i++) {
			Thread worker = new Thread(new Worker(numberOfPartialResults, ct));
			worker.setName("Thread " + i);
			worker.start();
			ct.getNumberWaiting();
			ct.getParties();
		}

		/*
		 * Thread th = new Thread(new PrintAggregateResult()); th.start();
		 */

	}

	class Worker implements Runnable {
		int result;
		CyclicBarrier cy;

		public Worker(int result, CyclicBarrier cy) {
			this.result = result;
			this.cy = cy;
		}

		public void run() {
			List<Integer> ls = new ArrayList<>();
			for (int i = 0; i < result; i++) {
				ls.add(result);
			}
			System.out.println("Sum is = " + ls.stream().collect(Collectors.summingInt(Integer::intValue))
					+ " in thread " + Thread.currentThread().getName());
			endResult.add(ls);

			try {
				System.out.println(cy.await());
				System.out.println(cy.await());
				System.out.println(
						Thread.currentThread().getName() + " number of waiting thread " + cy.getNumberWaiting());

			} catch (InterruptedException | BrokenBarrierException e) {
				e.printStackTrace();
			}

		}
	}

	class PrintAggregateResult implements Runnable {
		int sum = 0;
		@Override
		public void run() {
			for (List<Integer> ls : endResult) {
				int sum1 = ls.stream().collect(Collectors.summingInt(Integer::intValue));
				//ls.stream().filter(i -> !s.add(i)).collect(Collectors.toList());

				sum += sum1;
			}
			System.out.println("Sum of all threads = " + sum);

		}

	}

}
