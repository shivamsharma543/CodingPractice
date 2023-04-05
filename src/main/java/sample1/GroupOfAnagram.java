package main.java.sample1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * This program prints set of anagrams together in given string 
 * 
 * eg. 
 * setOfAnagrams("cat dog tac sat tas god dog") should print "cat tac dog god dog sat tas"
 *
 */

public class GroupOfAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "cat dog tac sat tas god dog name";
		List<String> result = setOfAnagramsInJava8(input);
		System.out.println(result+"***");
		
		//List result1 = setOfAnagrams(input);
		//System.out.println(result1+"***");
	}

	
	  public static List<List<String>> setOfAnagrams(String input) { 
		  String []arr=input.split(" ");
	  
	  HashMap<String,ArrayList<String>> map=new
	  HashMap<String,ArrayList<String>>(); for(String word : arr) {
	  
	  char str[]=word.toCharArray();
	  
	  Arrays.sort(str);
	  
	  
	  //String newstr =str.toString();
	  
	  String newstr=new String(str);
	  
	  if(map.containsKey(newstr)) map.get(newstr).add(word);
	  
	  else { ArrayList<String> ls=new ArrayList<String>(); ls.add(word);
	  map.put(newstr, ls); }
	  
	  }
	  
	  
	  return new ArrayList(map.values());
	  
	  }
	  
	  public static List<String> setOfAnagramsInJava8(String input) {
		   Map<String,ArrayList<String>>map=new HashMap<String,ArrayList<String>>();
		   
		   Arrays.stream(input.split(" ")).forEach(str->{
			                                              char ch[]=str.toCharArray();
			                                              Arrays.sort(ch);
			                                              String sortStr=new String(ch);
			                                              if(map.containsKey(sortStr)) 
			                                            	  map.get(sortStr).add(str);
			                                             else {
			                                            	  ArrayList<String> list=new ArrayList<String>();
			                                            	  list.add(str);
			                                            	  map.put(sortStr,list);
			                                             }
			                                              
			   
		   });
		   
		   return new ArrayList(map.values());
	  }	  
	 }
	 
	
	