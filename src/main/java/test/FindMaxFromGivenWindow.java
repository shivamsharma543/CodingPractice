package main.java.test;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FindMaxFromGivenWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Deque<Integer> q = new LinkedList<>();
		q.add(5);
		q.add(10);
		System.out.println("PeekFirst"+q.peekFirst());
		System.out.println("PeekLast"+q.peekLast());
		System.out.println(q);
      //System.out.println(findMaxFromWindow(new int[] {1,2,5,1,2,0,5},3));
	}
	
	public static List<Integer> findMaxFromWindow(int arr[], int window) {		
		Deque<Integer> q = new LinkedList<>();
		List<Integer> res = new ArrayList<>();
		int i=0;
		int j=0;
		q.peekLast();
		while(i<arr.length) {
			while(!q.isEmpty() && q.peek()<arr[i]) {
			     q.poll();				    
			}
			q.add(arr[i]);
			if(i-j+1==window) {
				res.add(q.peek());
				if(q.peek()==arr[j])
					q.poll();
					j++;
			}
			i++;	
		}
		return res;
	}
}

