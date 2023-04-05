package main.java.sample1;

/**
 * Finds the first character that does not repeat anywhere in the input string
 * Given "apple", the answer is "a" Given "racecars", the answer is "e"
 **/
public class FindFirstNonRepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findFirst("AApplea"));
	}

	public static char findFirst(String input) { // code goes here
		char ch[] = new char[256];

		for (int i = 0; i < input.length(); i++) {
			ch[input.charAt(i)]++;
			
		}

		int index = -1;

		for (int i = 0; i < input.length(); i++) {
			System.out.println(ch[input.charAt(i)]);
			if (ch[input.charAt(i)] == 1) {
				index = i;
				break;
			}
		}

		return input.charAt(index);
	}

}
