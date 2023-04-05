package main.java.sample1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;

//Find the best average grade.
//Given a list of student test scores
//Each student may have more than one test score in the list.

public class GetBestAverage {

	public static void main(String ars[]) {
		String[][] s1 = { { "Rohan", "-84" }, { "Sachin", "-102" }, { "Ishan", "-55" }, { "Sachin", "-18" }, { "Sachin", "-18" },{"Sachin","-112"}};

		System.out.println(bestAvgGrade(s1));
	}
		
	/*
	 * public static double bestAvgGrade(String[][] scores) {
	 * Map<String,ArrayList<Integer>>map=new HashMap(); double
	 * avg_max=Double.MIN_VALUE; for(int i=0;i<scores.length;i++) { String
	 * name=scores[i][0]; int marks=Integer.parseInt(scores[i][1]);
	 * if(map.containsKey(name)) map.get(name).add(marks); else { ArrayList
	 * <Integer>ls=new ArrayList<Integer>(); ls.add(marks); map.put(name,ls); }
	 * 
	 * }
	 * 
	 * for(Map.Entry<String,ArrayList<Integer>>entrymap:map.entrySet()) {
	 * OptionalDouble sum=
	 * entrymap.getValue().stream().mapToInt(Integer::intValue).average();
	 * if(sum.isPresent()) { if(sum.getAsDouble()>avg_max)
	 * avg_max=sum.getAsDouble(); } }
	 * 
	 * return avg_max; }
	 */
	
	 public static double bestAvgGrade(String[][] scores) {
		 
		 Map<String,ArrayList<Integer>> map=new HashMap<String,ArrayList<Integer>>();
		 double max_avg=Integer.MIN_VALUE;
		 
		 
	   for(int i=0;i<scores.length;i++) {
		    if(map.containsKey(scores[i][0]))
		    	map.get(scores[i][0]).add(Integer.parseInt(scores[i][1]));
		    else { 
		    	map.put(scores[i][0],new ArrayList<Integer>());
		    	map.get(scores[i][0]).add(Integer.parseInt(scores[i][1]));
		    }
	   }
	   
		/*
		 * for(Map.Entry<String,ArrayList<Integer>>map1:map.entrySet()) { double sum=0;
		 * double avg=0; Iterator<Integer>itr=map1.getValue().iterator(); {
		 * while(itr.hasNext()) { sum+=itr.next(); } avg=sum/map1.getValue().size();
		 * 
		 * }
		 * 
		 * if(avg>max_avg) max_avg=avg; }
		 */			
		  for(Map.Entry<String,ArrayList<Integer>>mapk:map.entrySet()) { 			  
		       OptionalDouble avg=mapk.getValue().stream().mapToInt(Integer::intValue).average();
		       if(avg.isPresent()) 
			      if(avg.getAsDouble()>max_avg) 
				       max_avg=avg.getAsDouble();
		  
		  }
		 
	   
	   return max_avg;
	   
	 }
	 
	
	}
	
		
		

