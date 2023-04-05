package main.java.sample2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionalInterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ls = new ArrayList<>();

		ls.add("Shivam");
		ls.add("Sharma");

		Function<List<String>, String> fs = (list) -> {
			                                           for(String str:list) {
			                                        	   if(str.equalsIgnoreCase("cat"))
			                                        		    return str;
			                                        	   }
			                                             return null;
		                                              };
		
		GetNumOfElemant f = (l) -> l.size();

		System.out.println(f.giveSizeOfList(ls));

		Thread threadWithLambda = new Thread(() -> {
			System.out.println("Thread Created with lambda");
		});
		

		Thread threadWithAnnonymousClass = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Thread Created with Annonymous class");

			}
		});

	    Thread threadWithOtherClassRunnable = new Thread(new ThreadTest());

	}

}

@FunctionalInterface
interface GetNumOfElemant {
	
	public int giveSizeOfList(List<String> ls);
}


class ThreadTest implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}

	