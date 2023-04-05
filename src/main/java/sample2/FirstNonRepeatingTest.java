package main.java.sample2;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	public static char findNonRepeatingFirstChar(String str) {
		Optional<Entry<Character,Long>> opt = str.chars().mapToObj(ch -> (char)ch).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, 
				                                                          Collectors.counting())).entrySet().stream().
		                                                                  filter(entry->entry.getValue()==1).findFirst();
		if(opt.isPresent())
			return opt.get().getKey();
		
		return ' ';
	}
}