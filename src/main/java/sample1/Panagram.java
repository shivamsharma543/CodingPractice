package main.java.sample1;

/**
 * Pangram FInder
 *
 * The sentence "The quick brown fox jumps over the lazy dog" contains
 * every single letter in the alphabet. Such sentences are called pangrams.
 * Write a function findMissingLetters, which takes a String `sentence`,
 * and returns all the letters it is missing
 *
 */

public class Panagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   // System.out.println(panagram("ABcDEFGHIJKLMNOPQRSTUVWXYZ"));
    System.out.println(missingInPanagram("abcdefGhi"));
	}

	public static boolean panagram(String str) {
		boolean arr[]=new boolean[26];
		
		for(int i=0;i<str.length();i++) {
			if('A'<=str.charAt(i) && 'Z'>=str.charAt(i)) 
				 arr[str.charAt(i)-'A']=true;
				 
			 if('a'<=str.charAt(i) && 'z'>=str.charAt(i)) 
					 arr[str.charAt(i)-'a']=true;
			 	
	    }
			
		for(int i=0;i<arr.length;i++) {
			if (arr[i]==false)
				return false;
		}
		return true;
  }	
	
	/*
	 * public static String missingInPanagram(String str) {
	 * 
	 * String result=""; for(char i='a';i<='z';i++) { if(str.indexOf(i)==-1 &&
	 * str.indexOf(Character.toUpperCase(i))==-1) if(result.indexOf(i)==-1)
	 * result+=i; } return result; }
	 */
	
	public static String missingInPanagram(String str) {
	   String result="";
	   for(char ch='a';ch<='z';ch++) {
		    if(str.indexOf(ch)==-1 && str.indexOf(Character.toUpperCase(ch))==-1)
		    	 if(result.indexOf(ch)==-1)
		    		 result+=ch;
	   }
	   
	   return result;
	}
	
}	
