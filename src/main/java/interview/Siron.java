package main.java.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Siron {

	int a , b  = 10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Siron obj = new Siron();
		
		List<String> ls = new ArrayList<>();
		
		ls.add("Java");
		ls.add("is");
		ls.add("multi");
		ls.add("and");
		ls.add("pla");
		ls.add("ind");
		
		//System.out.println(ls);
		Collections.swap(ls,2,6);
		
		for(String str:ls)
			 System.out.println(str);
		
		//System.out.println(obj.sum());

	}
	
	public int sum() {
	
		return a+b;
	}

}
 