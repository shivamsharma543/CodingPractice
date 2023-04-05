package main.java.sample1;

public class FindCycle {

	/**
	 *
	 * You have an integer array. Starting from arr[startIndex], follow each element
	 * to the index it points to. Continue to do this until you find a cycle. Return
	 * the length of the cycle. If no cycle is found return -1
	 *
	 */
	
	/*
	 * testsPassed&= countLengthOfCycle(new int[]{1, 0},0)==2;
	 * testsPassed&= countLengthOfCycle(new int[]{1, 2, 0},0)==3;
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = new int[] { 1, 1 };
		int arr1[] = new int[] { 1, 2, 3, 5, 1, 2 };   //1 2 3 5 2 3

		System.out.println(findCycle(arr1, 4));

	}

	public static int findCycle(int arr[], int startindex) {

		int[] arr1 = new int[arr.length];
		int loopIndex = -1;

		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = -1;
		}
		int c = 0;
		int strindex = startindex;
		while (arr1[strindex] == -1) {

			arr1[strindex] = 1;

			strindex = arr[strindex];

			if (strindex >= arr.length)
				return -1;
			if (strindex == arr[strindex])
				return 1;

			loopIndex = strindex;

			c++;
		}

		//System.out.println(c + "  ccccccccccccc");
		//System.out.println(startindex + "   startIndex" + "loopIndex*****" + loopIndex);

		/*if (loopIndex != startindex) {
			int temp = startindex;
			if (startindex > loopIndex) {
				startindex = loopIndex;
				loopIndex = temp;
			}
			for (int i = startindex; i < loopIndex;) {
				c--;
				i = arr[i];
			}
		}*/

		return c;
	}

}
