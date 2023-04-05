package main.java.sample1;

/*
 * Implement a run length encoding function.
 * For a string input the function returns output encoded as follows:
 *
 * "a"     -> "a1"
 * "aa"    -> "a2"
 * "aabbb" -> "a2b3"
 */

public class RelengthEncoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println( relength("aaaabbbcdec"));
	}

	/*
	 * public static StringBuilder relength(String str) { int c=1; StringBuilder
	 * newstr=new StringBuilder(); for(int i=0;i<str.length();i++) {
	 * 
	 * while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)) { c++; i++; }
	 * newstr.append(c); newstr.append(str.charAt(i-1)); } return newstr; }
	 */
	
	public static StringBuilder relength(String str) {
		 StringBuilder result=new StringBuilder("");
		 
		 for(int i=0;i<str.length();i++) {
			 int c=1;
			 while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1) ) {
				  c++;
				  i++;
			 }
			 
			 result.append(str.charAt(i));
			 result.append(c);
		 }
		 return result;
	}
}