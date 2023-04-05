package main.java.sample1;

public class Robot2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	findWinner("RRUU");
	}

	public static void findWinner(String letters) {
	      
	      int[] res = new int[2];
	      for(char ch : letters.toCharArray()){
	         
	         switch(ch) {
	           case 'R':
	               res[0]+=1;
	               break;
	           case 'L':
	                res[0]-=1;
	                break;
	           case 'U':
	                res[1]+=1;
	                break;
	           case 'D' :
	                res[1]-=1;
	                break;
	           default:
	              break;
	         }
	      }
	      
	      for(int num:res)
	         System.out.println(num);
	        
	    }
}
