package main.java.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;




public class FindUniqueInteger {

	public static void main(String ars[]) {
		List<Integer>ls=new ArrayList<Integer>();
		ls.add(1);
		ls.add(2);
		ls.add(1);
		ls.add(2);
		ls.add(5);
		
		Map<Integer,Long> map=ls.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(map);
		
		
		
	}
}


	
	

