package StringsChallenges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Input Format
 * 
 * First line will consist a string containing english alphabets which has at
 * most characters. 2nd line will consist an integer k.
 * 
 * Output Format
 * 
 * In the first line print the lexicographically minimum substring. In the
 * second line print the lexicographically maximum substring.
 * 
 * Sample Input
 * welcometojava 
 * 3 
 * 
 * Sample Output
 * ava 
 * wel
 * 
 * @author Danilo silva
 *
 */
public class JavaStringCompare {

	public static void main(String[] args) {
		// Insere String
		Scanner in = new Scanner(System.in);
		String str = in.next();
		// Insere Numero
		int k = in.nextInt();

		// Cria uma lista de Strings
		List<String> sub = new ArrayList<String>();
		// popula a lista com a quantidade de caractes inserida em K aleatorios
		for (int i = 0; i <= (str.length() - k); i++) {
			sub.add(str.substring(i, k + i));
		}

		// ordena a lista com Sort
		Collections.sort(sub);

		// imprime o primeiro da lista e o ultimo.
		System.out.println(sub.get(0));
		System.out.println(sub.get(sub.size() - 1));
	}

}
