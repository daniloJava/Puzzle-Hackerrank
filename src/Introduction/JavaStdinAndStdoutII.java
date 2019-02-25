package Introduction;

import java.util.Scanner;

/**
 * Input Format.
 * 
 * There are three lines of input:
 * 
 * The first line contains an integer. The second line contains a double. The
 * third line contains a String. Output Format
 * 
 * There are three lines of output:
 * 
 * On the first line, print String: followed by the unaltered String read from
 * stdin. On the second line, print Double: followed by the unaltered double
 * read from stdin. On the third line, print Int: followed by the unaltered
 * integer read from stdin. To make the problem easier, a portion of the code is
 * already provided in the editor.
 * 
 * @author tapower
 *
 */
public class JavaStdinAndStdoutII {
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = Integer.parseInt(scan.nextLine());
        double d = Double.parseDouble(scan.nextLine());
        String s = scan.nextLine();
        
        // Write your code here.
        
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }

}
