package main.java.test.interview;

import java.util.Arrays;

public class Paytm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = new int[] {1000,1200,1215};  
		int dep[] = new int[] {1100,1210,1220};
		
		System.out.println(findMinimumPlateform(arr,dep));

	}
	
	public static int findMinimumPlateform(int arr[],int dep[]) {
		
		Arrays.sort(arr);
		Arrays.sort(dep);
		
		int i = 0,j=0,max=Integer.MIN_VALUE,plateforNeeded = 1;
		
		while(i<arr.length && j<arr.length) {
			  if(arr[i]<=dep[j]) {
				  i++;
				  plateforNeeded++;
			  }
			  else if (arr[i]>dep[j]) {
				  j++;
				  plateforNeeded--;
			  }
			  
			  max = Math.max(plateforNeeded,max);
				  
		}
		
		return max;
		
	}
	
	

}
