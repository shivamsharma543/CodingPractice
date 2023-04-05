package main.java.sample1;

//find the median of the two sorted arrays.
// ex. {1, 3} and {2} is 2
public class MedianTwoArray {

	public static void main(String args[]) {
		int arr1[] = { 1, 2, 3, 4, 5, 6 };
		int arr2[] = { 4, 5, 6, 7 };
		System.out.println(findMedian(arr1, arr2));
	}

	public static double findMedian(int arr1[], int arr2[]) {

		int mergearr[] = new int[arr1.length + arr2.length];
		int i = 0, j = 0;
		int k = 0;
		int median = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] <= arr2[j]) {
				mergearr[k] = arr1[i];
				i++;
				k++;
			} else {
				mergearr[k] = arr2[j];
				j++;
				k++;
			}

		}

		while (i < arr1.length && k < mergearr.length) {
			mergearr[k] = arr1[i];
			k++;
			i++;
		}

		while (j < arr2.length && k < mergearr.length) {
			mergearr[k] = arr2[j];
			k++;
			j++;
		}

		if (mergearr.length % 2 == 0) {
			int mid = mergearr.length / 2;
			median = (mergearr[mid] + mergearr[mid + 1]) / 2;
		} else {
			return mergearr.length / 2;
		}

		return median;
	}
}
