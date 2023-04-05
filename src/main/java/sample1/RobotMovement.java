package main.java.sample1;

import java.util.Arrays;

public class RobotMovement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res[]=findMovement("ULR");
		/*
		 * for(int i=0;i<res.length;i++) { System.out.println(res[i]); }
		 */
		
		System.out.println(Arrays.equals(res, new int[] {0,0}));

	}
	
	public static int[] findMovement(String str) {
		 int[]res= {0,0};
		 
		for(char ch:str.toCharArray()) {
			
			switch (ch) {
			
			case'L':
				res[0]-=1;
				break;
			
			case'R':
			   res[0]+=1;
			    break;
			
			case'U':
			   res[1]+=1;
			    break;
			
			case'D':
				res[1]-=1;
				break;
				
			default:
				break;
		   }							 
		}
		 return res;
	}

}
