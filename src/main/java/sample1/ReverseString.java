package main.java.sample1;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(reverseString("abcdefg"));
	}
	
	public static String reverseString(String str) {
	
	char ch[]=str.toCharArray();
	char temp=' ';
	
	for(int i=0,j=str.length()-1;i<j;i++,j--) {
		temp=ch[i];
		ch[i]=ch[j];
		ch[j]=temp;
	}
	return String.copyValueOf(ch);
	}
	
	/*
	 * public static String reverseString1(String str) {
	 * 
	 * for(int i=0,j=str.length()-1;i<j;i++,j--) {
	 * 
	 * } //return String.copyValueOf(ch); }
	 */
	

}
