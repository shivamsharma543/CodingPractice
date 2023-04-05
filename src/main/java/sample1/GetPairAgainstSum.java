package main.java.sample1;

import java.util.HashMap;
import java.util.Map;

public class GetPairAgainstSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[] = {3,6,1,2,9};
        int target = 10;
        
       int [] res = getPairOfSum(arr,target);
       
       for(int i=0;i<res.length;i++) {
    	   System.out.println(res[i]);
       }
	
	}
	
	public static int[] getPairOfSum(int arr[],int target) {
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			map.put(i,arr[i]);
			
		}
		
		for(int i=0;i<arr.length;i++) {
			 int num = target - arr[i];
			   if(map.containsKey(num))
			      return new int [] {i,map.get(num)};
			   else
				   map.put(arr[i],i);
		}
		return null;		
		
	}
	

}
