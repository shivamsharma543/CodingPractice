package main.java.sample1;

/*int[] arr = { 1, 2, 3, 4 };
result = result && subArrayExceedsSum( arr, 6 ) == 2;
result = result && subArrayExceedsSum( arr, 12 ) == -1;*/

// Need to find a max length of array which is 

public class SubArrayExceeding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2,3,1,2,1,2,1,1,1,1};
		int []arr1= {};
		System.out.println(findSequece(arr, 7));

	}	
	
	public static int findSequece(int arr[],int target) {
	   int i=0;
	   int sum=0;
	   int j=0;
	   int minLength=Integer.MIN_VALUE;
		
		while(arr.length>i) {
			if(target==0)
				return 1;
			sum+=arr[i++];
			while(sum>=target) {
				minLength=Math.max(minLength, i-j);
				sum-=arr[j++];
			}			
		}
		
		if(minLength!=Integer.MIN_VALUE)
		   return minLength;
		else
			return -1;
	}	
}	

