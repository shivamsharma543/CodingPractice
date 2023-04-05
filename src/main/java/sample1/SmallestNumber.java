package main.java.sample1;

public class SmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(FindMin(new int[]{3,4,6,7,2}));
		System.out.println( FindMin(new int[]{2,1}));
		System.out.println(FindMin(new int[]{1}));

	}

	
	public static int  FindMin(int arr[]) {
		if(arr.length==1)
			 return arr[0];
		
		for (int i=0;i<arr.length-1;i++) {
			 if(arr[i]>arr[i+1])
				  return arr[i+1];
		 }
		
		return arr[0];
		
	}
}
