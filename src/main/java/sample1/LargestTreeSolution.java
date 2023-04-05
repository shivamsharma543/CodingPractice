package main.java.sample1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class LargestTreeSolution {


	/*
	 ** Get the size of the tree with root index rootIndex
	 */
	public static Integer getTreeSize(final Integer rootIndex, final Map<Integer, List<Integer>> parentToChild) {
		
		Stack<Integer> st = new Stack<>();
		int result = 0;
		st.push(rootIndex);
		while(!st.isEmpty()) {
			int parent = st.pop();
			for(int child:parentToChild.getOrDefault(parent, new ArrayList<>())) {
				st.push(child);
				result++;
			}
		}
		
		return result;
	}

	/*
	 ** Find the largest tree.
	 */
	public static int largestTree(final Map<Integer, Integer> immediateParent) {
		
		Map<Integer,List<Integer>> parentToChild = new HashMap<>();
		int max = Integer.MIN_VALUE;
		int answer = -1;
		
		for(Map.Entry<Integer,Integer> entry : immediateParent.entrySet()) {
			if(parentToChild.containsKey(entry.getValue())) {
				parentToChild.get(entry.getValue()).add(entry.getKey());
			}
			else {
				 List<Integer> ls = new ArrayList<>();
				 ls.add(entry.getKey());
				 parentToChild.put(entry.getValue(),ls);
			}
		}
		
		for(Map.Entry<Integer, List<Integer>> entry :parentToChild.entrySet()) {
			int result = getTreeSize(entry.getKey(),parentToChild);
			if(max<result) {
				 max =  result;
				 answer = entry.getKey();
			}
			if(max == result) {
				answer = Math.min(answer, entry.getKey());
			}
								
			
		}
		
		return answer;
	}

	/*
	 ** Returns true if the tests pass. Otherwise, returns false;
	 */
	public static boolean doTestsPass() {

		// map of test cases to expected results
		final Map<Map<Integer, Integer>, Integer> testCases = new HashMap<>();

		// example
		final Map<Integer, Integer> testCaseOneKey = new HashMap<>();
		testCaseOneKey.put(1, 2);
		testCaseOneKey.put(3, 4);
		testCases.put(testCaseOneKey, 2);

		// More than two trees
		final Map<Integer, Integer> testCaseTwoKey = new HashMap<>();
		testCaseTwoKey.put(2, 3);
		testCaseTwoKey.put(7, 8);
		testCaseTwoKey.put(12, 15);
		testCaseTwoKey.put(3, 1);
		testCaseTwoKey.put(13, 15);
		testCaseTwoKey.put(11, 15);
		testCaseTwoKey.put(9, 8);
		testCaseTwoKey.put(5, 12);
		testCases.put(testCaseTwoKey, 15);

		// really large index values
		final Map<Integer, Integer> testCaseThreeKey = new HashMap<>();
		testCaseThreeKey.put(200000000, 300000000);
		testCaseThreeKey.put(500000000, 200000000);
		testCaseThreeKey.put(700000000, 300000000);
		testCaseThreeKey.put(600000000, 700000000);
		testCaseThreeKey.put(900000000, 400000000);
		testCaseThreeKey.put(100000000, 400000000);
		testCaseThreeKey.put(800000000, 400000000);
		testCaseThreeKey.put(1000000000, 400000000);

		testCases.put(testCaseThreeKey, 300000000);

		// two trees of same size
		final Map<Integer, Integer> testCaseFourKey = new HashMap<>();
		testCaseFourKey.put(9, 4);
		testCaseFourKey.put(1, 4);
		testCaseFourKey.put(5, 2);
		testCaseFourKey.put(8, 4);
		testCaseFourKey.put(7, 3);
		testCaseFourKey.put(2, 3);
		testCaseFourKey.put(6, 7);
		testCaseFourKey.put(10, 4);

		testCases.put(testCaseFourKey, 3);

		// tree sizes differ by one
		final Map<Integer, Integer> testCaseFiveKey = new HashMap<>();
		testCaseFiveKey.put(35, 33);
		testCaseFiveKey.put(33, 28);
		testCaseFiveKey.put(31, 22);
		testCaseFiveKey.put(28, 25);
		testCaseFiveKey.put(34, 31);
		testCaseFiveKey.put(29, 27);
		testCaseFiveKey.put(21, 23);
		testCaseFiveKey.put(25, 21);
		testCaseFiveKey.put(22, 29);
		testCases.put(testCaseFiveKey, 23);

		boolean passed = true;
		for (Map.Entry<Map<Integer, Integer>, Integer> entry : testCases.entrySet()) {
			final Integer actual = largestTree(entry.getKey());
			if (!actual.equals(entry.getValue())) {
				passed = false;
				System.out.println("Failed for " + entry.getKey().toString() + "\n  expected " + entry.getValue()
						+ ", actual " + actual);
			}
		}

		return passed;
	}

	/*
	 ** Execution entry point.
	 */
	public static void main(String[] args) {
		// Run the tests
		if (doTestsPass()) {
			System.out.println("All tests pass");
		} else {
			System.out.println("Tests fail.");
		}
	}



}
