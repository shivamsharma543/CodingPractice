package main.java.sample2;

public class FindLongestSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = findString("aabbc");
		for(int num:arr) {
		   System.out.println(num);
		} 
		
		Math.sqrt(5);
		//System.out.println(str.substring(0,4));

	}
	
	
	public static int[] findString(String input) {
		 int longestStart = -1;
		    int longestLength = 0;
			int count = 1;
			int start = 0;
		    // your code goes here
			for(int i = 1; i < input.length(); i++) {
				if(input.charAt(i) == input.charAt(i-1)) {
					count++;
				}
				else {
					if(count > longestLength) {
						longestLength = count;
						longestStart = start;
							
					}	
					start = i;
					count = 1;
					
				}
			
			}
			if(count > longestLength) {
				longestLength = count;
				longestStart = start;
						
			}
		    return new int[]{ longestStart, longestLength };
		  }
}
	


