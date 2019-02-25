package StringsChallenges;

import java.util.Scanner;

/**
 * Given a string A, print Yes if it is a palindrome, print No otherwise.
 * 
 * Constraints
 * 
 * A will consist at most 50 lower case english letters. 
 * 
 * Sample Input
 * 
 * madam 
 * 
 * Sample Output
 * 
 * Yes
 * 
 * 
 * 
 * @author Danilo Silva
 *
 */
public class JavaStringReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		/* Enter your code here. Print output to STDOUT. */
		
		//Cria uma nova string com o Valor de A.reverse() que já inverte as letras
		String B = new StringBuilder(A).reverse().toString();
		//ja imprimindo com ternario.
		System.out.println(A.equalsIgnoreCase(B) ? "Yes" : "No");
	}

}
