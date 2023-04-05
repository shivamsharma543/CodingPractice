package main.java.test;

import java.util.HashMap;
import java.util.Map;

public class FindLongestSubStringOfUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "aabbccee";
		//String str = "abcdde";
		System.out.println(findSubStringOfUniqueChar(str,3));
	}
	
	
	public static int findSubStringOfUniqueChar(String str,int k) {
		
		Map<Character,Integer> map = new HashMap<>();
		int i=0;
		int j=0;
		int maxLength = Integer.MIN_VALUE;
		
		while(j<str.length()) {			
			Character ch = str.charAt(j);
			if(map.containsKey(ch))
				 map.put(ch,map.get(ch)+1);
			else
				map.put(ch,1);
			
			if(map.size()==k) {
				maxLength = Math.max(maxLength, j-i+1);
			}
			
			while(map.size()>k) {
				int count = map.get(str.charAt(i));
				char ch1 =  str.charAt(i);
				map.put(ch1,count-1);
				if(map.get(ch1) == 0)
					map.remove(ch1);
				i++;
			}

			j++;
		}
		
		return maxLength;
	}

}
