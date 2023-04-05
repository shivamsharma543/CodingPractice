package main.java.sample1;

public class DotProduct {

	  /**
	   *
	   * Given two arrays of integers, returns the dot product of the arrays
	   */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int arr1[]= {1,9,4,10};
		int arr2[]= {5,10,11,2};
		//System.out.println(getProduct(arr1,arr2));
		
		String[][] s1 = { 
				          { "Rohan", "84" }, 
				          { "Sachin", "102" }, 
				          { "Ishan", "55" }, 
				          { "Sachin", "18" } 
				          
				        };
		
		System.out.println(s1.length);
	}

	public static int getProduct(int arr1[],int arr2[]) {
		int sum=0;
		for(int i=0;i<arr1.length;i++) {
			sum=sum+(arr1[i]*arr2[i]);
		}
		
		return sum;
	}
}
