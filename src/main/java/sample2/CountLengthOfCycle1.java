package main.java.sample2;

public class CountLengthOfCycle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(findCycle(new int[]{1, 0}, 0));
		System.out.println(findCycle(new int[]{1, 2, 0}, 0));

	}
	
	public static int findCycle(int []arr,int startIndex) {
		
		int temp = Integer.MIN_VALUE;
		int count = 0;
		
		if(startIndex<0 || startIndex>arr.length-1)
			 return -1;
		while (arr[startIndex] != -1) {
			if(arr[startIndex]==startIndex)
				return 1;
			temp = arr[startIndex];
			arr[startIndex] = -1;
			startIndex = temp;
			count++;
			if (startIndex < 0 || startIndex > arr.length - 1)
				return -1;

		}		
		return count;
	}

}
