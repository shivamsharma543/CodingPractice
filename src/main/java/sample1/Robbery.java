package main.java.sample1;

//Implement the 'walk' method.
//Assume robot inital position is (0,0).
//walk method take path where each character corresponds to a movement of the robot.
//The robot moves up, down, left, and right represented by the characters 'U', 'D', 'L', and 'R'
//Ignore other characters.

public class Robbery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = new int[] { 6, 4, 2, 15, 9 };
		System.out.println(findMaxAmount(arr));

	}

	public static int findMaxAmount(int nums[]) {
		if (nums.length == 0)
			return 0;
		if (nums.length == 1)
			return nums[0];
		int[] dp = new int[nums.length];
		dp[0] = nums[0];
		dp[1] = Math.max(nums[0], nums[1]);
		for (int i = 2; i < nums.length; i++) {
			dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
		}
		return dp[dp.length - 1];

	}
}
