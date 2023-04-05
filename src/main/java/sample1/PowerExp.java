package main.java.sample1;

public class PowerExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println(findBase(10.5,3));
		
	}
	
	public static double findBase(double base,double exp) {
		
		double pexp;
		double result;
		
		if(base==1)
			return 1;
		if(exp==0)
			return 1;
		if(exp<0)
			 pexp=exp*(-1);
		else
			pexp=exp;
		if(pexp%2==0)
			result=findBase(base*base,pexp/2);
		else
			result=base*findBase(base*base,(pexp-1)/2);
		
		if(exp<0)
			return 1/result;
		else 
		   return result;
		
		
		
	}

}
