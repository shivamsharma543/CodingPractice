package main.java.java8;

import java.util.Arrays;
import java.util.List;

public class UseOfReduce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers = Arrays.asList(11);
		int result = numbers
		  .stream()
		  .reduce(123, (subtotal, element) -> subtotal + element);
		System.out.println(result);

	}

}
