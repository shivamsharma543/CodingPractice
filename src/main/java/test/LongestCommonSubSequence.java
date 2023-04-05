package main.java.test;

import java.util.Arrays;

public class LongestCommonSubSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(findIncreasingSubSequence(new int[] {1,2,3,2,1}));

	}
	
	public static int findIncreasingSubSequence(int arr[]) {
		
		int lis[] = new int[arr.length];
		lis[0] = 1;
		for(int i = 1;i<arr.length;i++) {
			lis[i] = 1;
			for(int j=0;j<i;j++) {
				if(arr[i]>arr[j] && lis[i]<=lis[j])
					lis[i] = lis[j]+1;
			}
		}
		
		return  Arrays.stream(lis).max().getAsInt();
	}

}
