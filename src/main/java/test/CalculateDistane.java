package main.java.test;

public class CalculateDistane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(calculateDistance(2,10,.50,10));

	}
	
	public static double calculateDistance(double totalQuantity, double additionalQuantity, double bonus,
			double distanceInOneLiter) {

		System.out.println("totalQuantity :"+ totalQuantity +" , "+"additionalQuantity: " +additionalQuantity);
		
		if (additionalQuantity == 0) {
			bonus = 0;
			additionalQuantity = 0;
		}
		if (totalQuantity <=0.0)
			return 0.0;

		return distanceInOneLiter
				+ calculateDistance(totalQuantity - 1 + bonus, additionalQuantity - bonus, bonus, distanceInOneLiter);
	}
}

