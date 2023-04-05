package main.java.sample2;

public class CountLengthOfCycle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println(findCycle(new int[]{1, 0}, 0));
    System.out.println(findCycle(new int[]{1, 2, 0}, 0));
	}

	public static int findCycle(int []arr,int startIndex) {
		
		int i = startIndex;
		int temp = 0,count = 0 ;
		
		if(startIndex > arr.length-1)
			return -1;
		while(arr[i]!=-1) {			
			if(arr[i]>arr.length-1)
				return -1;
			if(arr[i] == i)
				return 1;
			temp = arr[i];
			arr[i] = -1;
			i = temp;
			
			count++;
			 
		}
		
		return count;
	}
}
