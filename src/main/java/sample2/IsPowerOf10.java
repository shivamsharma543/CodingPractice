package main.java.sample2;

public class IsPowerOf10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isPowerOfTen(120));

	}
	
	public static boolean isPowerOfTen(int num) {

		while (num > 1) {
			if (num % 10 != 0)
				return false;
			num = num / 10;
		}

		return true;
	}

}
