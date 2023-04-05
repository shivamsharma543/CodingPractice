package main.java.sample2;

public class MedianOfSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr1[] = {2,2,3,4,9,10};
      int arr2[] = {4,5,6,7};
      
      System.out.println(findMedian(arr1,arr2));
	}

	public static double findMedian(int[] arr1, int arr2[]) {
		int[] result = new int[arr1.length + arr2.length];

		int i = 0;
		int j = 0;
		int index = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j])
				result[index++] = arr1[i++];
			else 
				result[index++] = arr2[j++];
		}

		while (i < arr1.length) {
			result[index++] = arr1[i++];
		}

		while (j < arr2.length) {
			result[index++] = arr2[j++];
		}

		double median = 0.0;
		if(result.length%2==0)
			 median = ((double)result[result.length/2]+(double)result[(result.length/2)-1])/2;
		else
			median = (double)result[result.length/2];
		return median;
	}

}
