package Introduction;

import java.util.Scanner;

/**
 * Task Given an integer, , perform the following conditional actions:
 * If is odd, print Weird If is even and in the inclusive range of to , print
 * Not Weird If is even and in the inclusive range of to , print Weird If is
 * even and greater than , print Not Weird Complete the stub code provided in
 * your editor to print whether or not is weird.
 * Input Format
 * A single line containing a positive integer, .
 * 
 * @author tapower
 *
 */
public class JavaIfElse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String ans = "";
		if (n % 2 == 1) {
			ans = "Weird";
		} else {
			if (n <= 2 || n <= 5) {
				ans = "Not Weird";
			} else {
				if (n <= 6 || n <= 20) {
					ans = "Weird";
				} else {
					ans = "Not Weird";
				}
			}
			// Complete the code
		}

		System.out.println(ans);

	}
}
