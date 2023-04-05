package main.java.test;

import java.util.Arrays;

// To find the maximum number of plateform required to accomodate all train without waiting for each other.
public class MinimumPlateform {

    public static void main(String args[]) {

		int arr[] = new int[] {1000,1200,1215};  
		int dep[] = new int[] {1100,1210,1220};     //7,15,17,20

        findMinPlateform(arr, dep, arr.length);
        System.out.println("Minimum number plateform needed = " + findMinPlateform(arr, dep, arr.length));
    }

    public static int findMinPlateform(int[] arr, int dep[], int n) {

        // plat_needed indicates number of platforms
        // needed at a time

        Arrays.sort(arr);
        Arrays.sort(dep);

        int result = 1 ;
        int plateformNeeded = 1;
        int i = 1;
        int j = 0;
        while(i<n && j<n) {
            if (arr[i] <= dep[j]) {
                i++;
                plateformNeeded++;
            } else if (dep[j] < arr[i]) {
                j++;
                plateformNeeded--;
            }
            if (result < plateformNeeded)
                result = plateformNeeded;
        }
          return result;
    }

}
