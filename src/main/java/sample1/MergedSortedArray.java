package main.java.sample1;

public class MergedSortedArray {
	
	public static void main(String args[]) {

	int[] arr1 = { 1, 3, 5, 7 };
	int n1 = arr1.length;

	int[] arr2 = { 2, 4, 6, 8 };
	int n2 = arr2.length;


	int arr[] = mergeArrays(arr1, arr2, n1, n2);
 
    System.out.println("Array after merging");
    for (int i=0; i < n1+n2; i++)
        System.out.print(arr[i] + " ");
}

	public static int[] mergeArrays(int[] arr1, int[] arr2, int n1, int n2) {
		int a = 0;
		int b = 0;
		int k = 0;
		int res[] = new int [n1+n2];
		
		while(a<n1 && b<n2) {
			if(arr1[a] <= arr2[b]) {
				res [k] = arr1[a];
				a++;
				k++;
			}
			else {
				res [k] = arr2[b];
				b++;
				k++;				
			}
		}
		
		if(a<n1) {
			 while(a<n1) {
			 res[k++] = arr1[a++];
			 }
		}
		if(b<n2) {
			 while(b<n2) {
			     res[k++] = arr2[b++];
			 }
		}
	    return res;	
	}
}
		/*for(;a<n1 && b<n2;) {
			if(arr1[a]<arr2[b]) {
				arr[k]=arr1[a];
			    a++;
			    k++;
			}
			else {
				arr[k]=arr2[b];
			    b++;
			    k++;
			}
		}
		
		for(;a<n1;) {
			arr[k]=arr1[a];
		    a++;
		    k++;
		}
		
		for(;b<n2;) {
			arr[k]=arr2[b];
		    b++;
		    k++;
		}
        return arr;
	}*/

