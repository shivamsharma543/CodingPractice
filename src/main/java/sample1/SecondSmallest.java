package main.java.sample1;

public class SecondSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(secondSmallest(new int []{1,3,5,1,2}));
	}

	public static int secondSmallest(int arr[]) {
	
		int smallest=Integer.MAX_VALUE;
		int secsmallest=Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<smallest) {
				secsmallest=smallest;
				smallest=arr[i];
				
			}
			else if(arr[i]<secsmallest)
				    secsmallest=arr[i];
			
		}
		return secsmallest;
	}
}
