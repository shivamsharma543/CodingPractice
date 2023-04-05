package main.java.sample1;

import java.util.HashMap;
import java.util.Map;

/**
 * Implement the method that provided numerator and denominator will return a
 * string representing fraction's decimal form. Some fractions in decimal form
 * have cyclic decimal points.
 *
 * Examples: 1/2 = 0.5 1/3 = 0.(3)
 */

public class FractionToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(vulgarToDecimal(1l, 56l));
		/*
		 * System.out.println(findDecimal(1l, 3l)); System.out.println(findDecimal(1l,
		 * 30l)); System.out.println( findDecimal(1l, 75l)); System.out.println(
		 * findDecimal(1l, 56l)); System.out.println( findDecimal(4l, 7l));
		 */

	}

	public static String vulgarToDecimal(Long numerator, Long denominator) {
		if (numerator == 0)
			return "0";
		if (denominator == 0)
			return "";

		String result = "";

		// is result is negative
		if ((numerator < 0) ^ (denominator < 0)) {
			result += "-";
		}

		// convert int to long
		long num = numerator, den = denominator;
		num = Math.abs(num);
		den = Math.abs(den);

		// quotient
		long res = num / den;
		result += String.valueOf(res);

		// if remainder is 0, return result
		long remainder = (num % den) * 10;
		if (remainder == 0)
			return result;

		// right-hand side of decimal point
		HashMap<Long, Integer> map = new HashMap<Long, Integer>();
		result += ".";
		while (remainder != 0) {
			// if digits repeat
			if (map.containsKey(remainder)) {
				int beg = map.get(remainder);
				String part1 = result.substring(0, beg);
				String part2 = result.substring(beg, result.length());
				result = part1 + "(" + part2 + ")";
				return result;
			}

			// continue
			map.put(remainder, result.length());
			res = remainder / den;
			result += String.valueOf(res);
			remainder = (remainder % den) * 10;
		}

		return result;
	}
}
