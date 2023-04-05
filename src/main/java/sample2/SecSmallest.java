package main.java.sample2;

public class SecSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(secSmallest(new int [] {10,5,8,1,3,2}));
       
	}

	public static int secSmallest(int arr[]) {
		                                             
		int smallest = Integer.MAX_VALUE;
		int sec_smallest = Integer.MAX_VALUE;		
		for(int i=0;i<arr.length;i++) {
			 if(arr[i]<smallest) {
				 sec_smallest = smallest;
				 smallest = arr[i];
				 
			 }
			 else if(arr[i]<sec_smallest) {
				 sec_smallest = arr[i];
			 }
		}
		
		return sec_smallest;
	}
}
