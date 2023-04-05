package main.java.sample1;

import java.util.Arrays;

public class DistanceBetweenTwoWord {

	   // Input two words returns the shortest distance between their two midpoints in number of characters
	   // Words can appear multiple times in any order and should be case insensitive.
	   
	   // E.g. for the document="Example we just made up"
	   //   shortestDistance( document, "we", "just" ) == 4
	
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
		
		System.out.println(distanceBetweenWord(document,"and", "graphic"));
		
		//distanceBetweenWordWithLookBehind();
		
		//System.out.println(distanceBetweenWord("Shivam. ,Sharma    Akshay","Sharma","Shivam"));

	}
	
	public static double distanceBetweenWord(String paragraph,String word1,String word2) {
		String[]paragraph1=paragraph.split("[,. ]");
		double wordL1=0;
		double wordL2=0;
		int indexL=0;

		double minL=Double.MAX_VALUE;;
		
		for(String word: paragraph1) {
			
			if(word.equalsIgnoreCase(word1)) {
				wordL1=indexL+(word.length()/2d);
				//System.out.println(word + " " +  wordL1 +  "  "+"index"+" "+indexL);
			}
			else if(word.equalsIgnoreCase(word2))
				wordL2=indexL+(word.length()/2d);
			
			//System.out.println(word + " " +  wordL1 +  "  "+ wordL2 + " " + word);
			if(wordL1>0 && wordL2>0) {
			  double currentL=Math.abs(wordL1-wordL2);                             //Shivam Sharma is from jaspur.Shivam is from india which is in jaspur.
			    if(currentL<minL)
			    	minL=currentL;
			}   
			
			indexL=indexL+word.length()+1;
		}
		
		if(wordL1==0 || wordL2==0)
			 return -1;
		return minL;
	}
	
	
	public static double distanceBetweenWordWithLookBehind() {
		
		String paragraph1 = "Shivam.  ,Sharma  .  Akshay";
		
		String []paragrap = paragraph1.split("[. ,]");
		//String[]paragraph2=paragraph1.split("(?<=[. ,])|(?=[. ,])");
		
		for(String str:paragrap)
		System.out.println(str);
		System.out.println(paragrap.length);
        

		
		
		
		return 0.0;

		
	}

}
