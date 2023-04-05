package main.java.sample2;

public class RunLengthEncoding3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(findRunLength("aabcddds"));
	}

	public static StringBuilder findRunLength(String str) {
		
		StringBuilder result = new StringBuilder();
		int count = 1;
		for(int i=1;i<str.length();i++) {
			if(str.charAt(i-1)==str.charAt(i))
				 count++;
			else {
				 result.append(str.charAt(i-1));
				 result.append(count);
				 count=1;
			}
					
		}
		
		result.append(str.charAt(str.length()-1));
		result.append(count);
		
		return result;
	}
}
