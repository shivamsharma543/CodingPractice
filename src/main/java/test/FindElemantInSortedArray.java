package main.java.test;

public class FindElemantInSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,3,4};
		
		System.out.println(findElemant(arr,41));

	}
	
	public static boolean findElemant(int arr[],int target) {
		
		int l=0;
		int h=arr.length-1;
		
		while(l<=h) {
			int mid = (l+h)/2;
			if(arr[mid]==target)
				return true;
			if(target<arr[mid])
				h=mid-1;
			else
				l=mid+1;
		}
		return false;
	}
	
	
	
	
	
	
	
	
	
	

}
