package Introduction;

import java.util.Scanner;

/**
 * Input Format
 * 
 * The first line will contain the number of testcases . Each of the next lines
 * will have three integers, , , and .
 * 
 * We have provided a code stub in the editor which handles the input operation.
 * 
 * Output Format
 * 
 * Print the answer to each test case in separate lines.
 * 
 * Sample Input
 * 
 * 2 0 2 10 5 3 5
 * 
 * Sample Output
 * 
 * 2 6 14 30 62 126 254 510 1022 2046
 * 
 * 8 14 26 50 98
 * 
 * @author Danilo Silva
 *
 */
public class JavaLoops {

	public static void main(String[] argh) {
		int x = 0;
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {

			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();
			x = x + a;
			for (int j = 0; j < n; j++) {
				x = x + (int) (Math.pow(2, j)) * b;
				System.out.print(x + " ");
			}
			x = 0;
			System.out.println();
		}
		in.close();

	}

}
