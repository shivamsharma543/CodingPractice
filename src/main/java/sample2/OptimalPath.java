package main.java.sample2;

public class OptimalPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] arr = new int[][] { { 0, 0, 0, 0, 5 }, { 0, 1, 1, 1, 0 }, { 2, 0, 0, 0, 0 } };

		 int result = findOptimalPath(arr);
		 
		 System.out.println(result);
	}
	
	public static int findOptimalPath(int [][] arr) {
		
		int [][] dp = new int [arr.length][(arr[0].length)];
		for(int i=0;i<dp.length;i++) {
			for(int j=0;j<dp[i].length;j++) {
				dp[i][j]=0;
			}
		}
		
		for(int i=dp.length-1;i>=0;i--) {
			for(int j=0;j<dp[0].length;j++) {
				if(i==dp.length-1 && j==0) {
					dp[i][j]=arr[i][j];
				}
				else if(i==dp.length-1) {
					    dp[i][j]=arr[i][j]+dp[i][j-1];
				}
				else if(j==0) {
					dp[i][j]=arr[i][j]+dp[i+1][j];
				}
				else {
					dp[i][j]=Math.max(dp[i][j-1],dp[i+1][j])+arr[i][j];
				}
			}
		}
		return dp[0][(arr[0].length-1)];
	}

}
