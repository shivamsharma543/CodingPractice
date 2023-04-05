package main.java.sample2;

import java.util.HashSet;
import java.util.Set;

public class PrimeFactorization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          System.out.println(primeFactorization(200));
	}

	public static Set<Integer> primeFactorization(int x) {
		Set<Integer> set = new HashSet<Integer>();
        int temp = x;
		if (x == 2) {
			set.add(2);
			return set;
		} else {
			for (int i = 2; i < Math.sqrt(temp); i++) {
				if (x % i == 0) {
					set.add(i);
					while (x % i == 0 && x > 1) {
						x /= i;
					}

				}
			}
		}
		if(x>2)
         set.add(x);
		return set;
	}
}
