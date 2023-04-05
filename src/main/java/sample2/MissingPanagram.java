package main.java.sample2;

import java.util.HashSet;
import java.util.Set;

public class MissingPanagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(findMssingPanagram("abcdefghjhijklmnopqrstuvwXYZ"));

	}
	
	public static StringBuilder findMssingPanagram(String str) {
		
		Set<Character> set = new HashSet<>();
		String lowerCaseString = str.toLowerCase();
	    for(int i=0;i<lowerCaseString.length();i++) {
	    	set.add(lowerCaseString.charAt(i));
	    }
	    StringBuilder result = new StringBuilder();    
	    for(char ch = 'a';ch<='z';ch++) {
	    	if(!set.contains(ch))
	    		result.append(ch);
	    }
	    
	    return result;
	}

}
