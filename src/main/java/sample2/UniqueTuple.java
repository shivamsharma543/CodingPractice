package main.java.sample2;

import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueTuple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(findUniqueTuple("abbb", 2));

	}
	
	public static Set<String> findUniqueTuple(String str,int length){
		Set<String> result = new LinkedHashSet<>();
		for(int i=0;i<str.length()-length+1;i++) {
		    	result.add(str.substring(i, i+length));
		}
		
		return result;
	}        

}
