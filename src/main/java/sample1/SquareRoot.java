package main.java.sample1;



public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //System.out.println(getSquare(2.0));
     System.out.println(squareRoot(10.0));
     
     //System.out.println(getSquare(5.0));
     //System.out.println(getSquare(100.0));
	}

	
	public static double squareRoot(double x)
	{
		double temp;
		double sr=x/2;
		do
		{
			temp=sr;
			sr=(temp+(x/temp))/2;
		}
		while((temp-sr)!=0);
		return sr;
	}
	
   public static double getSquare(Double num) {
	   double res=0;
	   double i=1;   
	   boolean flag=false;
	   
	   while(!flag) {
		   
		   if(i*i==num) {
			   flag=true;
               res=i;
			  
		   }
		   else if(i*i>num) {
			   res=findmiddleSquare(num,i-1,i);
		       flag=true;
		   }
		   i++;
	   }
	   return res;
		   
   }
   
   public static double findmiddleSquare(double num,double l,double r) {
	   double middle=(l+r)/2;
	   
	   double product=middle*middle;
	   
	   //System.out.println(product+" ");
	   
	   if((product==num) || (Math.abs(product-num) < 0.00001)) {
		   //System.out.println(product); 
		   return middle;
		    
	   }
	   else if(product<num) {
		   //System.out.println(product); 
		   return findmiddleSquare(num,middle,r);
	   }
	   else
		   return findmiddleSquare(num,l,middle);
   }
}
