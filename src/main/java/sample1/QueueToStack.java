package main.java.sample1;

import java.util.LinkedList;
import java.util.Queue;

public class QueueToStack {

	static Queue<Integer> q1 = new LinkedList<Integer>();
	static Queue<Integer> q2 = new LinkedList<Integer>();

	static Queue<Integer> normalQueue = new LinkedList<Integer>();

	public static void main(String[] args) {

		System.out.println("Top is "+push(5));
		System.out.println("Top is "+push(6));
		System.out.println("Top is "+push(7));
		System.out.println("Top is "+push(8));

		/*
		 * pushWithPopCostly(5); pushWithPopCostly(6); pushWithPopCostly(7);
		 * pushWithPopCostly(8); System.out.println(getTop()); popCostly();
		 * System.out.println(getTop());
		 */
	}

	public static int push(int numberToPush) {
		q1.add(numberToPush);
		while (!q2.isEmpty()) {
			q1.add(q2.peek());
			q2.remove();
		}
		Queue<Integer> q = q1;
		q1 = q2;
		q2 = q;
		return q2.peek();
	}

	public static void pop() {
		if (!q2.isEmpty())
			q2.remove();
	}

	public static void popCostly() {

		if (q1.isEmpty())
			return;
		while (q1.size() != 1) {
			q2.add(q1.peek());
			q1.remove();
		}

		Queue<Integer> q = q1;
		q1 = q2;
		q2 = q;
	}

	public static int getTop() {

		if (q1.isEmpty())
			return -1;
		while (q1.size() != 1) {
			q2.add(q1.peek());
			q1.remove();
		}

		int top = q1.peek();
		q2.add(top);
		Queue<Integer> q = q2;
		q2 = q1;
		q1 = q;
		return top;
	}

	public static void pushWithPopCostly(int num) {
		q1.add(num);
	}

}
