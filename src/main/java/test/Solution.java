package main.java.test;

import java.util.Arrays;
import java.util.stream.Stream;

class Solution {
  public static void main(String[] args) {
    
    System.out.println(findCoutOfSnowPack(5,2));



  } 
  
	public static int findCoutOfSnowPack(int no, int k) {

		int[] arr = Stream.iterate(1, i -> i + 1).limit(no).mapToInt(num -> Integer.valueOf(num.toString())).toArray();

		int elemantToRemove = 0, count = 0, j = -1, n = (arr.length) - 1;
		while (n != elemantToRemove) {
			j++;
			if (arr[j] != -99) {
				count++;
			}
			if (arr[j] != -99 && count == k) {
				arr[j] = -99;
				count = 0;
				elemantToRemove++;
			}
			if (j == n )
				j = -1;

		}

		return Arrays.stream(arr).filter(num -> num > -1).findFirst().getAsInt();
	}
                         
}
