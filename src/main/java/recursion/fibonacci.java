package main.java.recursion;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(findRecurssion(5));
	}

	public static int findRecurssion(int num) {
		
		System.out.println(num);
		if(num==0 || num==1)
			return 1;
		else
			return findRecurssion(num-1)+findRecurssion(num-2);
	}
}
