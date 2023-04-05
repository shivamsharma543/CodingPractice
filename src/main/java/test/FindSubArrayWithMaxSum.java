package main.java.test;

public class FindSubArrayWithMaxSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(findSubArray(new int[] {5,10,0,15,-2,-25}));
	}
	
	public static StringBuffer findSubArray(int arr[]) {
		int currentSum = arr[0];
		int overallSum = arr[0];
		int startIndex = 0,endIndex = 0,bestStartIndex = -1, bestEndIndex = -1;
		
		for(int i=1;i<arr.length;i++) {
			 if(currentSum>=0) {
				 currentSum+=arr[i];
				 endIndex = i;
			 }
			 else {
				  currentSum = arr[i];
				  startIndex = i;
				  endIndex = i;
			 }
			 
			 if(currentSum>overallSum) {
				 overallSum = currentSum;
				 bestStartIndex = startIndex;
				 bestEndIndex = endIndex;				 
			 }
		}
		System.out.println(overallSum);
		StringBuffer result = new StringBuffer();
		for(int i = bestStartIndex;i<=bestEndIndex;i++) {
			result.append(arr[i]);
		}
		return result;
	}

}
