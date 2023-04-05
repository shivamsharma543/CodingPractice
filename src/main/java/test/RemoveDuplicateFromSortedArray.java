package main.java.test;

public class RemoveDuplicateFromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,1,1,2,2,3,3};
		System.out.println(removeDuplicateFromSortedArray(arr));

	}

	
	public static int removeDuplicateFromSortedArray(int arr[]) {
		
		int i=0,j=1,count=0;
		
		while(i<arr.length && j<arr.length) {			
			while(j<arr.length && arr[i]==arr[j]) {
				arr[j] = -1;				
				j++;
				count++;
			}
			i=j;
			j++;
		}
		for(int a:arr) {
		   System.out.println(a);
		}
		System.out.println();
		System.out.println();
		return arr.length-count;
	}
}
