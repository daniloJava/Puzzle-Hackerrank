package Introduction;

import java.util.Scanner;

/**Sinceramente, nem lembrava desse conceito mais. 
 * è uma forma que os OS tem de ler o arquivo até o fim como já disse
 * no Wikipedia, tem o conceito https://pt.wikipedia.org/wiki/EOF
 * 
 * e no forum do GUJ no final do forum foi o que eu fiz...kkkkk
 * http://www.guj.com.br/t/como-ler-o-arquivo-ate-o-final-eof/76640/11
 * 
 * Input Format
 * 
 * Read some unknown lines of input from stdin(System.in) until you reach EOF;
 * each line of input contains a non-empty String.
 * 
 * Output Format
 * 
 * For each line, print the line number, followed by a single space, and then
 * the line content received as input.
 * 
 * Sample Input
 * 
 * Hello world I am a file Read me until end-of-file.
 * 
 * Sample Output
 * 
 * 1 Hello world 2 I am a file 3 Read me until end-of-file.
 * 
 * @author Danilo Silva
 *
 */
public class JavaEOF {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		for (int i = 1; scan.hasNext() == true; i++) {
			System.out.println(i + " " + scan.nextLine());
		}
	}
}
