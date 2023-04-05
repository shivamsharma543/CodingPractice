package main.java.sample2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class ApacheLogNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input[] = new String[] { "10.0.0.3 - log entry 1 11", "10.0.0.2 - log entry 2 213",
		"10.0.0.1 - log entry 133132","10.0.0.3 - log entry 1 11","10.0.0.3 - log entry 1 11","10.0.0.3 - log entry 1 11","10.0.0.1 - log entry 1 11" };
        //System.out.println(findOccurence(input));
		findOccurence(input);

	}

	
	public static void findOccurence(String arr[]) {
		
		Map<String,Integer> map = new HashMap<>();
		Arrays.stream(arr).forEach( str->{
			                               String spiltedString = str.split(" ")[0];
			                               if(map.containsKey(spiltedString)) {
			                            	   int count = map.get(spiltedString);
			                            	   map.put(spiltedString,count+1);
			                               }
			                               else {
			                            	     map.put(spiltedString, 1);
			                               }
		                                   });
		System.out.println(map);
		
		System.out.println(map.entrySet().stream().max((e1,e2) -> e1.getValue().compareTo(e2.getValue())).get().getKey());
		System.out.println(map.entrySet().stream().max((e1,e2) -> e1.getValue().compareTo(e2.getValue())).get().getValue()); 
	}
	
	
}
