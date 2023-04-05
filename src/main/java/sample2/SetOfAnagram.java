package main.java.sample2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SetOfAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(listofAnagram(Arrays.asList(new String[] {"cat","tac","dog","ogd","shiv"})));
		
		System.out.println(listOfAnagramWithJava8(new String[] {"cat","tac","dog","ogd","shiv"}));

	}

	public static List<String> listofAnagram(List<String> ls) {
		
		Map<String,List<String>> map = new HashMap<>();
		List<String> result = new ArrayList<>();
		 ls.stream().forEach(str -> {
			                          char [] array = str.toCharArray();
			                          Arrays.sort(array);
			                          String sortedString = String.valueOf(array);
			                          if(map.containsKey(String.valueOf(sortedString))) {
			                        		  List<String> tempList = map.get(sortedString);
			                        		  tempList.add(str);
			                        		  map.put(sortedString, tempList);
			                          }
			                          else {
			                        	  List<String> tempList = new ArrayList<>();
			                        	  tempList.add(str);
			                        	  map.put(sortedString,tempList );
			                          }
			                        	 
		 });
		 
		 map.entrySet().stream().filter(entry -> entry.getValue().size()>1).forEach(entry -> {
			                                                                                  result.addAll(entry.getValue());
		                                                                                     });
		 return result;
	}
	
	
	public static List<String> listOfAnagramWithJava8(String arr[]) {

		Map<String, List<String>> map = new HashMap<>();
		Arrays.stream(arr).forEach(str -> {
			char[] temp = str.toCharArray();
			Arrays.sort(temp);
			String sortedStr = String.valueOf(temp);
			if (map.containsKey(sortedStr)) {
				map.get(sortedStr).add(str);
			} else {
				List<String> ls = new ArrayList<>();
				ls.add(str);
				map.put(sortedStr, ls);
			}
		});

		 return map.entrySet().stream().filter(entry -> entry.getValue().size() > 1).flatMap(entry1 -> entry1.getValue().stream()).collect(Collectors.toList());
				

	}
}
