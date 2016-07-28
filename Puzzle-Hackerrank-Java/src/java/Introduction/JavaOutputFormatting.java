package java.Introduction;

import java.util.Scanner;

/**
 * Problema
 * 
 * Sample Input
 * 
 * java 100 
 * cpp 65 
 * python 50 
 * 
 * Sample Output
 * 
 * ================================ 
 * java 		100 
 * cpp 			065 
 * python 		050
 * ================================
 * 
 * @author tapower
 *
 */

public class JavaOutputFormatting {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            
            //Impressao contento -15 caracteres a esquerda, e formatando o inteiro com 3 casas ou 0 esquerda.
            System.out.printf("%-15s%03d%n", s1, x);
            //Complete this line
        }
        System.out.println("================================");

}
	
}
