package main.java.sample1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindIpAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[] = new String[] { "10.0.0.1 - log entry 1 11", "10.0.0.1 - log entry 2 213",
				"10.0.0.2 - log entry 133132" };

		Map<String, Integer> map = new HashMap<String, Integer>();
		List<String> ls = new ArrayList<>();
		Arrays.stream(str).forEach(input -> {
			String ip = input.split(" ")[0];
			ls.add(ip);
			int count = 0;
			if (map.containsKey(ip)) {
				count = map.get(ip);
				map.put(ip, count + 1);
			} else {
				map.put(ip, count + 1);
			}
		});

		String result = map.entrySet().stream().max((o1, o2) -> o1.getValue() > o2.getValue() ? 1 : -1).get().getKey();
        
		ls.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().
		max((o1,o2)->o1.getValue()>o2.getValue()?1:-1).get().getKey();
		
		
		System.out.println(result);
	}

}
