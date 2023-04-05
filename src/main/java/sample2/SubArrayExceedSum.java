package main.java.sample2;

public class SubArrayExceedSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(findSubArray(new int[] {9,3,5,3,5},1));
		System.out.println(findSubArray(new int [] {},0));

	}
	
	public static int findSubArray(int[]arr,int target) {
		int i=0,j=0,sum=0,length=-1,arrSum=0;
		
		while(i<arr.length) {			
			sum+=arr[i];
			if(sum<target)
				length = Math.max(length, i-j+1);
			while(sum>target && j<arr.length) {
				sum-=arr[j++];
			}
			
			arrSum+=arr[i];
			i++;
			
		}
		
		if(arr.length == 0 && target==0)
		   return 0;
		if(target>arrSum)
		   return -1;
		return length;
				
	}

}
