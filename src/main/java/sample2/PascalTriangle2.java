package main.java.sample2;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(findFromPascal(1,1));

	}
	
	public static int findFromPascal(int col, int row) {
		List<List<Integer>> tri = new ArrayList<>();
		List<Integer> first = new ArrayList<>();
		first.add(1);
		tri.add(first);
		for (int i = 1; i <= row; i++) {
			List<Integer> prev = tri.get(i-1);
            List<Integer> cur = new ArrayList<Integer>();
            cur.add(1);
            for(int j=1;j<i;j++) {
            	cur.add(prev.get(j-1)+prev.get(j));
            }
            cur.add(1);
            tri.add(cur);
		}
		
		return tri.get(row).get(col);
	}
	
	

}
