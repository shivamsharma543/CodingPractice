package main.java.sample1;

public class PowerOf10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int x=10001;
       int y=1;
    //System.out.println(Integer.MIN_VALUE);
        while(y<x) {
        	y=y*10;
    	}
        
        System.out.println(x==y);
        
        int arr[]={5,100,200,2000};
        System.out.println(secondSmall(arr));
	}

    public static int secondSmall(int arr[]) {
    	int smallest=Integer.MAX_VALUE;
    	int secsmall=Integer.MAX_VALUE;
    	for(int i=0;i<arr.length;i++) {
    		if(arr[i]<smallest) {
    			secsmall=smallest;
    		    smallest=arr[i];
    		}
    		else if(arr[i]<secsmall){
    			secsmall=arr[i];
    		}
    			
    	}
    return secsmall;
    }
}
