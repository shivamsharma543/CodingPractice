package main.java.sample1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ApacheLog {

	/**
	 * Given a log file, return IP address(es) which accesses the site most often.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input[] = new String[] { "10.0.0.1 - log entry 1 11", "10.0.0.3 - log entry 2 213",
				"10.0.0.3 - log entry 133132","10.0.0.3 - log entry 133132","10.0.0.4 - log entry 133132" };
		System.out.println(findTopIpaddress(input));
	}

	public static String findTopIpaddress(String[] result) {

		Map<String, Integer> map1 = new HashMap<String, Integer>();

		Arrays.stream(result).forEach((input) -> {
			String str = input.split(" ")[0];
			int count = 0;
			if (map1.containsKey(str)) {
				count = map1.get(str);
				map1.put(str, count + 1);
			} else {
				map1.put(str, 1);
			}
		});

		return map1.entrySet().stream().max((o1, o2) -> o1.getValue() > o2.getValue() ? 1 : -1).get().getKey();

	}

}
