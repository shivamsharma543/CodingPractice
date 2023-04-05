package main.java.sample2;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "abcabcd";
		System.out.println(findFirstNonRepeating(str));

	}

	/*
	 * public static char findFirstNonRepeating(String str) {
	 * 
	 * char result = ' ';
	 * 
	 * Optional<Entry<Character,Long>> res = str.chars().mapToObj(ch -> (char) ch
	 * ).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,
	 * Collectors.counting())) .entrySet().stream().filter(entry ->
	 * entry.getValue()==1) .findFirst();
	 * 
	 * if(res.isPresent()) result = res.get().getKey(); return result; }
	 */
	
	public static char findFirstNonRepeating(String str) {
		
		Optional<Entry<Character,Long>> entry= str.chars().mapToObj(ch -> (char)ch).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting())).entrySet().stream().filter(e -> e.getValue()==1).findFirst();
	
	    if(entry.isPresent())
	    	return entry.get().getKey();
	    
	    return ' ';
	}
}
