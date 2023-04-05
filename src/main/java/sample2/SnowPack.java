package main.java.sample2;

public class SnowPack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = new int[]{0,1,3,0,1,2,0,4,2,0,3,0};
		
		int result = findSnowPack(arr);
		
		System.out.println(result);

	}

	public static int findSnowPack(int [] arr) {
		
		int [] fromLeft = new int [arr.length];
		int [] fromRight = new int [arr.length];
		int countOfPack = 0;
		
		fromLeft[0]=arr[0];
		
		for(int i=1;i<fromLeft.length;i++) {
			fromLeft[i]=Math.max(arr[i],fromLeft[i-1]);
		}
		
		fromRight[fromRight.length-1] = arr[arr.length-1];
		for(int i=fromRight.length-2;i>=0;i--) {
			fromRight[i] = Math.max(arr[i],fromRight[i+1]);
			
		}
		
		for(int i=0;i<arr.length;i++) {
			countOfPack+=Math.min(fromLeft[i],fromRight[i])-arr[i];
		}
		
		return countOfPack;
	}
}
