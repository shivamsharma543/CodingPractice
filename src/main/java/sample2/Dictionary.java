package main.java.sample2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Dictionary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.out.println(findWord(new String[]{"to", "toe", "toes", "doe", "dog", "god", "dogs", "banana","ote"},"toe"));
	
	//System.out.println(validateString("toe","toe"));
		
	}
	
	public static List<String> findWord(String arr[],String letters){
		List<String> res = new ArrayList<>();
		int maxLen = 0;
		for(String word:arr) {
			if(word.length()>=maxLen) {
			   if(!validateString(word,letters)) {
				res.add(word);
			    maxLen=word.length();
			  }
			}
		}
	  int max = maxLen;
	
	List<String> result = res.stream().filter(str -> str.length()==max).collect(Collectors.toList());
	
	return result;
	 
		
	}

	public static boolean validateString(String word,String letters) {
		return word.chars().mapToObj(ch -> (char)ch).anyMatch(ch -> letters.indexOf(ch)<0);
	}
}
