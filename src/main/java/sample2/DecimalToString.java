package main.java.sample2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DecimalToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(decimalToString(22, 7));
		System.out.println(decimalToString(1, 3));
		System.out.println(decimalToString(1, 6));
		System.out.println(decimalToString(6, 11));
	}

	public static String decimalToString(int num, int den) {

		List<Character> result = new ArrayList<>();
		int number = num / den;

		if (number == 0) {
			result.add('0');
		} else {
			while (number > 0) {
				int rem = number % 10;
				result.add((char) (rem + '0'));
				number /= 10;
			}

		}

		if (num % den == 0)
			return formString(result);
		result.add('.');
		int rem = num % den;
		Map<Integer, Integer> map = new HashMap<>();
		while (rem > 0) {
			if (map.containsKey(rem)) {
				result.add(map.get(rem), '(');
				result.add(')');
				break;
			} else {
				map.put(rem, result.size());
			}

			rem *= 10;
			int new_rem = rem / den;
			result.add((char) (new_rem + '0'));
			rem %= den;
		}

		return formString(result);
	}

	public static String formString(List<Character> ls) {
		String result = "";
		for (char ch : ls) {
			result += ch;
		}

		return result;

	}

}
