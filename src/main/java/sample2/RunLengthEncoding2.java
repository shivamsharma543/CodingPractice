package main.java.sample2;

public class RunLengthEncoding2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println(getString("aabbbc"));
	}
	
	public static StringBuilder getString(String str) {
		StringBuilder result = new StringBuilder();
		int count = 1;
		int i = 0;
		 for( i = 0;i<str.length()-1;i++) {
			 
			 if (str.charAt(i)==str.charAt(i+1)) {
				  count++;
				  result.append(str.charAt(i));
			 }
			 else {
				 result.append(str.charAt(i));
				 result.append(count);
				 count = 1;				 
			 }
		 }
		 
		 result.append(str.charAt(i));
		 result.append(count);
		 
		 return result;
	}

}
