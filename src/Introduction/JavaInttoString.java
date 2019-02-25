package Introduction;

import java.util.Scanner;

/**
 * You are given an integer , you have to convert it into a string. Please
 * complete the partially completed code in the editor. If your code
 * successfully converts into a string the code will print "Good job". Otherwise
 * it will print "Wrong answer".
 * 
 * n can range between -100 to 100 inclusive.
 * 
 * @author Danilo Silva
 *
 */
public class JavaInttoString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		// String s=???; Complete this line below
		
		
		/**
		 * Esse é muito Bobo.
		 * 
		 * simplismente ele pede para usar essa isntrução usando o metodo
		 * estatico das classes de tipos primitivos, conseguimos converter em
		 * String
		 * 
		 * Double.toString(n); 
		 * Boolean.toString(n); 
		 * Float.toString(n);
		 * Character.toString(n);
		 * 
		 */
		String s = Integer.toString(n);
		
		
		
		
		if (n == Integer.parseInt(s)) {
			System.out.println("Good job");
		} else {
			System.out.println("Wrong answer.");
		}
	}

}
