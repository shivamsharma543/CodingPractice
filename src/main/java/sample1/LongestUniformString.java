package main.java.sample1;

/**
 * 
 * e.g. for the input: "abbbccda" the longest uniform substring is "bbb" (which
 * starts at index 1 and is 3 characters long).
 */
public class LongestUniformString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "aabbc";
		int[] arr = findUniformString(str);
		for (int num : arr) {
			System.out.println(num);
		}

	}

	public static int[] findUniformString(String str) {

		int maxLength = Integer.MIN_VALUE;
		int startIndex = -1;
		for (int i = 0; i < str.length(); i++) {
			int currentLength = 1;
			int strindex = i;
			while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
				currentLength++;
				i++;
			}
			if (currentLength > maxLength) {
				maxLength = currentLength;
				startIndex = strindex;
			}

		}
		return new int[] { startIndex, maxLength };
	}

}