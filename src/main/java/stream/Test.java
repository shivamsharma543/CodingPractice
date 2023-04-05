package main.java.stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
     
		///System.out.println(findElemant(new int[]{1,2,3,4,5},5));

    
	}
	
	 public  static int findElemant(int arr[],int elemant) {
		    
		    int l = 0, r = arr.length-1;
		    
		    while(l<r){
		      
		      //System.out.println(l); 
		      //System.out.println(r);
		       int mid = l + (r-l)/2;
		    
		       if(arr[mid] == elemant)
		           return mid;
		    
		       if(elemant<arr[mid]) {
		          r = mid;
		          l = 0;
		       }
		    
		       if(elemant>arr[mid]) {
		          l = mid;
		          r = arr.length-1;
		       }
		   }
		      return -1;
		  
		 }

	
}