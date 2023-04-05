package main.java.sample1;

/*

** There is a staircase with 'n' number of steps. A child
** walks by and wants to climb up the stairs, starting at
** the bottom step and ascending to the top.instead
** of taking 1 step at a time, it will vary between taking
** either 1, 2 or 3 steps at a time.
** Given 'n' number of steps below method should find
** number of
** unique combinations the child could traverse.
** An example would be countSteps(3) == 4:
** 1 1 1
** 2 1
** 1 2
** 3
*/

public class StairCase {


	
	public static Integer countSteps(Integer n) {
		// this follows fibbonacci series when value should be sum of last 3 elements
		// (as kid can take upto 3 steps at a time)
		// but there is one thing to notice, the value of ways(n) is equal to
		// fibonacci(n+1).
		// 0 1 1 2 4 7 13....
		return runFibbonacci(n + 1);
	}

	static int runFibbonacci(int number) {
		if (number <= 1) {
			return number;
		}
		if (number == 2) {
			return 1;
		}
		return runFibbonacci(number - 1) + runFibbonacci(number - 2) + runFibbonacci(number - 3);
	}

	public static boolean doTestsPass() {
		return countSteps(3) == 4 && countSteps(4) == 7;
	}

	public static void main(String[] args) {
		if (doTestsPass()) {
			System.out.println("All tests pass");
		} else {
			System.out.println("Tests fail.");
		}

		for (Integer n = 1; n <= 2; n++) {
			Integer numberOfCombinations = countSteps(n);
			System.out.println(n + " steps => " + numberOfCombinations);
		}
	}
}
