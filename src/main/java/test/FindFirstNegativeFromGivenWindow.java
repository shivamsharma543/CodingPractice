package main.java.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FindFirstNegativeFromGivenWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {7,-1,-8,3,5,15};
		System.out.println(findFirstNegative(arr,3));

	}
	
	
	public static List<Integer> findFirstNegative(int arr[],int target) {
		
		int j=0;
		int i=0;
		Queue<Integer> queue = new LinkedList<>();
		List<Integer> result = new ArrayList<>();
		while(j<arr.length) {
			if(arr[j]<0) {
				queue.add(arr[j]);
			}
			if(j-i+1 == target) {
				if(queue.size() == 0)
					result.add(0);
				else {
				   result.add(queue.peek());
			       if(arr[i] == queue.peek())
					 queue.poll();
				}
				i++;
			}
			j++;
		}
		
		return result;
	}

}
