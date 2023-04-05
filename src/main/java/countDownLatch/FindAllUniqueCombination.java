package main.java.countDownLatch;

import java.util.ArrayList;
import java.util.List;

public class FindAllUniqueCombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "abcdef";   
		int count = 2;
		List<String> ls = new ArrayList<>();
		for (int i = 0; i <= str.length() - 1; i++) {
			if(count==1)
				ls.add(String.valueOf(str.charAt(i)));
			else {
				for (int j = i + 1; j <= str.length()-1; j++) {
					String temp = String.valueOf(str.charAt(i));
					int k = 0;
					int a = j;
					while (k < count - 1 && a <= str.length()-1) {
						temp += str.charAt(a++);
						k++;
						
					}
					if(temp.length() == count)
					   ls.add(temp);
					temp = "";
				}
			}

		}

		System.out.println(ls);

		System.out.println(ls.size());

	}

}
