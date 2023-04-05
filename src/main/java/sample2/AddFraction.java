package main.java.sample2;

public class AddFraction {

	public static void main(String[] args) {
	    //findFraction( new int[]{ 2, 3 }, new int[]{ 1, 2 } );  
		 int[] result = findWinner( new int[]{ 100,200 }, new int[]{ 400,10 } );  
		 System.out.println(result[0]);
		 System.out.println(result[1]);
	}

	public static int [] findFraction(int [] arr1,int[] arr2) {
		 
		int []result = new int[2];
		
		result[0]=  arr1[0]*arr2[1]+arr1[1]*arr2[0];
		result[1]= arr1[1]*arr2[1];
		
		int num = result[0];
		int dem = result[1];
		
		int max = Math.max(num, dem);
		for(int i=(int) Math.sqrt(max);i>1;i--) {
			if(num%i==0 && dem%i==0) {
				num /=i;
				dem/=i;
			}
		}
		 result[0] = num;
	     result[1] = dem;
		 return result;
	}
	
	public static int[] findWinner( int[] arr1,int[] arr2) {
        
        int res[] = new int [2];
     
        res[0] = arr1[0]*arr2[1] + arr1[1] * arr2[0];
        res[1] = arr1[1] * arr2[1];
     
        int maxNum = Math.max(res[0],res[1]);
     
       for(int i = (int)Math.sqrt(maxNum);i>1;i--){
           if(res[0] % i == 0 && res[1] % i == 0){
             res[0]/=i;
             res[1]/=i;
           }
       }
     return res;
   }
}
