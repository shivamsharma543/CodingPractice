package main.java.sample2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public class FindBestAvg {

	public static boolean doTestsPass()
    {
        Map<String[][], Integer> testCases = new HashMap<>();

		/*
		 * testCases.put(new String[][] { { "Bobby", "87" }, { "Charles", "100" }, {
		 * "Eric", "64" }, { "Charles", "22" } }, 87);
		 */
        testCases.put(new String[][] {},
                0);
		/*
		 * testCases.put(new String[][] { { "Sarah", "91" }, { "Goldie", "92" }, {
		 * "Elaine", "93" }, { "Elaine", "95" }, { "Goldie", "94" }, { "Sarah", "93" }
		 * }, 94);
		 */
        testCases.put(new String[][] { { "Janie", "-66" },
                        { "Janie", "0" },
                        { "Gina", "-88" },
                        { "Bobby", "0" },
                        { "Gina", "44" },
                        { "Bobby", "0" },
                        { "Bobby", "-6" } },
                -2);
		/*
		 * testCases.put(new String[][] { { "Alpha", "99" }, { "Bravo", "99" }, {
		 * "Charlie", "99" }, { "Delta", "99" }, { "Echo", "99" }, { "Foxtrot", "99" },
		 * { "Foxtrot", "99" } }, 99);
		 */
		/*
		 * testCases.put(new String[][] { { "Gerald", "91" }, { "Gerald", "92" } }, 91);
		 */
        testCases.put(new String[][] { { "Barry", "-66" },
                        { "Barry", "-65" },
                        { "Alfred", "-122"} },
                -66);

        boolean passed = true;
        for(Map.Entry<String[][], Integer> entry : testCases.entrySet())
        {
            Integer actual = bestAverageGrade(entry.getKey());
            if(actual != entry.getValue())
            {
                passed = false;
                System.out.println("Failed for " + Arrays.deepToString(entry.getKey()) + "\n  expected " + entry.getValue() + ", actual " + actual);
            }
        }

        return passed;
    }

    public static void main(String[] args)
    {
        if(doTestsPass())
        {
            System.out.println("All tests pass");
        }
        else
        {
            System.out.println("Tests fail.");
        }
    }

	
	public static int bestAverageGrade(String [][] avg) {
		
		Map<String,List<Integer>> map = new HashMap<>();
		AtomicReference<Integer> data = new AtomicReference<>(); 
	    data.set(Integer.MIN_VALUE);
		for(int i=0;i<avg.length;i++) {
				String name = avg[i][0];
				int marks = Integer.valueOf(avg[i][1]);
				if(map.containsKey(name)) {
					List<Integer> ls = map.get(name);
					ls.add(marks);
			    }
				else {
					  List <Integer> ls = new ArrayList<>();
					   ls.add(marks);
					   map.put(name, ls);
				}
		}
		
		map.entrySet().stream().forEach(entry -> {
			                                       int  sum =  entry.getValue().stream().mapToInt(Integer::intValue).sum();
			                                       int average =	Math.floorDiv(sum, entry.getValue().size());
			                                       System.out.println("sum is "+ sum+" average is "+average+"  map is  "+entry.getValue());
		                                           if(data.get()<average) {
		                                        	   data.set(average);
		                                           }
		});
		
		 if(data.get()==Integer.MIN_VALUE) {
			 System.out.println("returning 0");
			      return 0;
		 }
		 System.out.println("returning "+ data.get());
		 return data.get();
		}
	
}
