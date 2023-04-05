package main.java.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class CheckStringToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>ls=new ArrayList<Integer>();
		Set<Integer>set=new HashSet<Integer>();
		
		set.add(30);
		System.out.println("checking   "+set.contains(Integer.valueOf(30)));
		String str= "12345";
		
		ls.add(Integer.valueOf(str));
		
		System.out.println(ls);
		
		ls.add(24);
		System.out.println("Size before the remove "+ls.size());
		
		ls.remove(0);
		System.out.println("Size after the remove "+ls.size());
		
		List<Integer> ls12 = new ArrayList<>();
		
		Collections.sort(ls12);
		
		

	}

}
