package main.java.test;

public class FindLongestSubArrayWitGivenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {10,10,5,4,11};
        System.out.println(FindLength(arr));
	}
	
	public static int FindLength(int arr[]) {
		
		int i = 0;
		int j = 0;
		int sum = 0;
		int max = -1;
		
		while(j<arr.length) {
			sum+=arr[j];
			
			if(sum<=20)
				max = Math.max(max, j-i+1);
			
			while(sum>20) {
				sum-=arr[i];
				i++;
			}
			j++;
		}
		
		return max;
	}

}
