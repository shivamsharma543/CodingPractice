package main.java.test;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateInJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> ls = new ArrayList<>();
		ls.add(1);
		ls.add(2);
		ls.add(89);
		ls.add(9);
		ls.add(1);
		ls.add(2);
		
		System.out.println(ls.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(entry -> entry.getValue()>1).collect(Collectors.toList()));
		
		String str = "shivamsharma";
		
		System.out.println(str.chars().mapToObj(ch -> (char) ch).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting())).entrySet().stream().filter(entry->entry.getValue()==1).findFirst().get().getKey());

	}
	
	/*
	 * public int[] findArrayOfDuplicate(int arr[]) {
	 * 
	 * Set<Integer> items = new HashSet<>(); Set<Integer> res =
	 * Arrays.asList(arr).stream() .filter(n -> !items.add(n))
	 * .collect(Collectors.toSet());
	 * 
	 * }
	 */
	
	

}
