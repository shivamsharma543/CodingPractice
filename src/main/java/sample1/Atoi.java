package main.java.sample1;

// Takes a string str and returns the int value represented by
// the string. 
//For example, atoi("42") returns 42.
public class Atoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println(atoi("-1232"));
		System.out.println(atoi("-123.123"));
	}

	
	
	public static double atoi(String str) {
	  double result=0;
	  int i=0;
	  double sign=1;
	  double result1=0.0;
	  boolean flag=true;
	  double multiplication=1;
	  if(str.charAt(i)=='-') {
		  i++;
	      sign=-1;
	  }
	  
	  for(;i<str.length();i++) {
		  if((str.charAt(i)>='0' && str.charAt(i)<='9') || str.charAt(i)=='.')
				  if(str.charAt(i)=='.' || !flag) {
					   if(flag)
						  i++; 
					  flag=false;
			          result1=result1*10+str.charAt(i)-48; 
			          multiplication=multiplication*10;
					} 
		     if(flag)
		         result=result*10+str.charAt(i)-48;
	  }
	  
	  if(!flag) {
		  result1=result1/multiplication;
		  result+=result1;
	  }	  
	  
	  
	  
	  return result*sign;
	}
	
	
	
	
}
