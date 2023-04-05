package main.java.test;


/////  Find a cycle in array when given value become index
public class FindCycleInArray {

	public static void main(String[] args) {

		int arr[] = new int [] {1,1};
		int arr1[] = new int[] { 0, 2, 3, 1, 1, 7 };   //3,1,2,3
		System.out.println(findCycle(arr1, 0));


	}
	
	public static int findCycle(int arr[], int index) {

		if(index > arr.length-1)
			return -1;		
		
		int length = 0;		
		int i = index;		
		
		while(arr[i] != -1) {
			 int temp = arr[i];
			 arr[i] = -1;
			 i = temp;
			 length++;
			 if(i>arr.length-1)
				 return -1;
			 if(arr[i] == i)
				 return 1;
			 
		}
		
		return length;
	}

	
}
