package StringsChallenges;

import java.util.Scanner;

/**
 * Input Format
 * 
 * The first line contains a string . The second line contains another string .
 * The strings are comprised of only lowercase English letters.
 * 
 * Output Format
 * 
 * There are three lines of output: For the first line, sum the lengths of and .
 * For the second line, write Yes if is lexicographically larger than or No if
 * it is not. For the third line, capitalize the first letter in both and and
 * print them on a single line, separated by a space.
 * 
 * @author Danilo Silva
 *
 */
public class JavaStringsIntroduction {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		/* Enter your code here. Print output to STDOUT. */
		
		// somando os caracteres
		System.out.println(A.length() + B.length());
		
		// Se A é primeiro na ordem alfabetica que B
		if (A.compareTo(B) > 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		/**aqui eu pego a Primeira letra com o ubstring (0 é onde começa, 1 é quanos caracteres apartir dali
		 * Supstring com apenas um argumente, ele vai pegar daquela posição em diante.
		 * 
		 */
		A = (A.substring(0, 1)).toUpperCase() + A.substring(1);
		B = (B.substring(0, 1)).toUpperCase() + B.substring(1);
		System.out.println(A + " " + B);

	}

}
