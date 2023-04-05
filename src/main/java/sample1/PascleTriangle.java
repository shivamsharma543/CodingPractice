package main.java.sample1;

/*
**  Below formation is called Pascals Triangle.
**
**  Example:
**               1
**              1 1
**             1 2 1
**            1 3 3 1
**           1 4 6 4 1
**         1 5 10 10 5 1
**        1 6 15 20 15 6 1
**
**  Complete the 'pascal' function below so that given a
**  col and a row it will return the value in that positon.
**
**  Example, pascal(1,2) should return 2
**
*/

public class PascleTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = getPascle(4);

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(" ");
				System.out.print(arr[i][j]);
			}
		}
	}

	public static int[][] getPascle(int n) {

		int ptr[][] = new int[n][n];

		for (int line = 0; line < n; line++) {

			for (int i = 0; i <= line; i++) {
				if (i == 0 || i == line)
					ptr[line][i] = 1;
				else
					ptr[line][i] = ptr[line - 1][i - 1] + ptr[line - 1][i];
			}
		}
		return ptr;
	}
}
