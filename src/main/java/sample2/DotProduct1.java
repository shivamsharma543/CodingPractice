package main.java.sample2;

public class DotProduct1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(getProduct(new int [] {1,2,3},new int [] {4,5,6}));
	}
	
	public static int getProduct(int arr1[],int arr2[]) {
		int i=0;
		int res = 0;
		while(i<arr1.length && i<arr2.length) {
			res+=arr1[i]*arr2[i];
			i++;
		}
		
		return res;
	}

}
