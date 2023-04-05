package main.java.sample1;

import java.util.HashMap;
import java.util.Map;

public class FractionToDecimalnew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
	    long number=(2%5)*10;
		//System.out.println(number);
		System.out.println(fractionToDecimal(11,21));
	}
	
	public static String fractionToDecimal(long numerator,long denominator) {
		
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
				result = part1 +  part2 ;
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
