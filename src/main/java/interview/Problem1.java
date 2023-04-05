package main.java.interview;


// Island problem 
public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 int[][] arr  = {{0,1,1},
		             {1,0,1}
	                };	 
	 
          System.out.println(findNumberOfIsland(arr,arr.length,arr[0].length));
	}

	public static int findNumberOfIsland(int [][] arr,int row,int col) {
		
		int numOfIsland = 0;
		
		 for (int i=0;i<row;i++) {
			 for(int j=0;j<col;j++) {
				  if(arr[i][j]==1) {
					  markIsland(arr,i,j,row,col);
					  numOfIsland++;
				  }
			 }
		 }
		 return numOfIsland;
	}
	
	public static void markIsland(int [][] arr,int i,int j,int row,int col) {
		
		if(i>=row || i<0|| j<0 || j>=col || arr[i][j]!=1)
			return;

		    arr[i][j]=-1;
			markIsland(arr,i-1,j,row,col);

			markIsland(arr,i+1,j,row,col);

			markIsland(arr,i,j+1,row,col);

			markIsland(arr,i,j-1,row,col);
	}
}
