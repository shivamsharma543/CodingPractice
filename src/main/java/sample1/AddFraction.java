package main.java.sample1;

public class AddFraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addFractions(new int[] { 2, 3 }, new int[] { 1, 2 });
	}

	public static void addFractions(int[] fraction1, int[] fraction2) {
		int n1=fraction1[0];
		int n2=fraction2[0];
		int d1=fraction1[1];
		int d2=fraction2[1];
		int gcd=0;
		
		int d3=d1*d2;
		int n3=n1*d2+n2*d1;
		
		int min= n3>d3?d3:n3;
		
		for(int i=min;i>0;i--) {
			if(d3%i==0 && n3%i==0) {
				gcd=i;
		        break;
			 } 
		System.out.println(n3/gcd+"  "+d3/gcd);
	}
  }
}	

