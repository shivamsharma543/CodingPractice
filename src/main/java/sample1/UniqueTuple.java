package main.java.sample1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/*
 * String input = "aab"; if( result.contains( "aa" ) && result.contains( "ab" )
 * ) { System.out.println( "Test passed." );
 */

public class UniqueTuple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String>hs=uniqueTuples("abcde",3);
		//System.out.println("abcde".substring(0,5));
		System.out.println(hs);
	}

	public static Set<String> uniqueTuples(String inputString, int length) {

		Set<String> set = new LinkedHashSet<>();
		
		  for(int i=0;i<=inputString.length()-length;i++) {
			  String str = inputString.substring(i,i+length);
			  set.add(str);
		  }
		  return set;

     }
}