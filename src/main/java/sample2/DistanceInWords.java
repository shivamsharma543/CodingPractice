package main.java.sample2;

public class DistanceInWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String document= " ";
		StringBuffer sb = new StringBuffer();
		sb.append(
				"In publishing and graphic design, lorem ipsum is a filler text commonly used to demonstrate the graphic elements");
		sb.append(
				" lorem ipsum text has been used in typesetting since the 1960s or earlier, when it was popularized by advertisements");
		sb.append(
				" for Letraset transfer sheets. It was introduced to the Information Age in the mid-1980s by Aldus Corporation, which");

		document = sb.toString();
		
		System.out.println(findDistance(document,"and", "graphic"));

	}
	
	public static double findDistance(String para, String word1, String word2) {

		String[] words = para.split("[,. ]");
		double wordL1 = 0, wordL2 = 0;
		int indexL = 0; 
		double minL = Double.MAX_VALUE,curr = 0;
		for (String word : words) {
			if (word.equals(word1))
				wordL1 = indexL + (word.length() / 2d);
			if (word.equals(word2))
				wordL2 = indexL + (word.length() / 2d);
			if (wordL1 > 0 && wordL2 > 0) {
				curr = Math.abs(wordL1 - wordL2);
				if (curr < minL)
					minL = curr;
			}

			indexL += word.length() + 1;
		}

		return minL;
	}

}
