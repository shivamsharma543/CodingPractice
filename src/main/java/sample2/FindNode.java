package main.java.sample2;

import java.util.concurrent.atomic.AtomicReference;

public class FindNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AtomicReference<Integer> data = new AtomicReference<>(); 
	    data.set(Integer.MIN_VALUE);
	    System.out.println(data.get());
	    data.set(5);
	    System.out.println(data.get());

	}
	
	/*
	 * public <k>void put(Node<k> node,int value ) { if(node ==null) return;
	 * if(node.com>value)
	 * 
	 * }
	 */
}


/*
 * class Node<k implements Comparator<k>>{
 * 
 * Node<k> left; Node<k> right; k value;
 * 
 * public Node(k value){ this.value = value;
 * 
 * } }
 */
