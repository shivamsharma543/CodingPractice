package main.java.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class LargetTree {

	public static void main(String[] args) {
		
		Map<Integer,Integer> testCaseFiveKey = new HashMap<>(); 
		testCaseFiveKey.put( 35, 33 );       //35  ---> 33P
		testCaseFiveKey.put( 33, 28 );       //33  ---> 28P
		testCaseFiveKey.put( 31, 22 );
		testCaseFiveKey.put( 28, 25 );
		testCaseFiveKey.put( 34, 31 );
		testCaseFiveKey.put( 29, 27 );
		testCaseFiveKey.put( 21, 23 );
		testCaseFiveKey.put( 25, 21 );
		testCaseFiveKey.put( 22, 29 );

		System.out.println(findLargetTree(testCaseFiveKey));

	}
	
	public static int findLargetTree(Map<Integer,Integer> childToParent) {
		Map<Integer,List<Integer>> parentToChild = new HashMap<>();
		int maxResult = Integer.MIN_VALUE;
		int answer = 0;
		for(Map.Entry<Integer, Integer> child: childToParent.entrySet()) {
			if(parentToChild.containsKey(child.getValue())) {
				parentToChild.get(child.getValue()).add(child.getKey());
			}
			else {
				  List<Integer> ls = new ArrayList<>();
				  ls.add(child.getKey());
				  parentToChild.put(child.getValue(), ls);
			}
		}
		
		for(Map.Entry<Integer,List<Integer>> entry:parentToChild.entrySet()) {
			int result = findLargetTree(entry.getKey(),parentToChild);
            if(result>maxResult) {
            	maxResult = result;
            	answer = entry.getKey();
            }

		}
		return answer;
	}
	
	public static int findLargetTree(int parent,Map<Integer,List<Integer>> map) {
		 Stack<Integer> stack = new Stack<>();
		 int result = 0;
		 stack.push(parent);
		 while(!stack.isEmpty()) {
			 int node = stack.pop();
			 for(int child:map.getOrDefault(node,new ArrayList<Integer>())) {
				 stack.push(child);
				 result++;
			 }
		 }
		 
		 return result;
		
	}

}
