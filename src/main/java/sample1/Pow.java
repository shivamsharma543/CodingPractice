package main.java.sample1;

/* Given base and integer exponent, compute value of base raised to the power of exponent.
 */

/*double result = power(2,2);
return testsPass && result==4;*/

public class Pow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getValue(3, -4));

	}

	public static double getValue(int base, int exp) {
		int i = 1;
		double result = 1;
		int expt = exp;

		if (exp < 0)
			expt = -1 * exp;

		while (i <= expt) {
			result *= base;
			i++;
		}

		if (exp < 0) {
			result = 1 / result;
		}

		return result;
	}
}
