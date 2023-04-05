package main.java.sample1;

import java.util.LinkedList;
import java.util.List;

/**
 * Return an array containing prime numbers whose product is x
 * Examples:
 * primeFactorization( 6 ) == [2,3]
 * primeFactorization( 5 ) == [5]
 */

public class PrimeFactorization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(findPrimaryFactor(100));

	}

	public static List<Integer> findPrimaryFactor(int number) {
		List<Integer>ls=new LinkedList<Integer>();
		if(number==1)
			return ls;
		
		for(int i=2;i<number;i++) {
			while(number%i==0) {
				number=number/i;
				ls.add(i);
			}
		}
		
		return ls;
	}	
}	