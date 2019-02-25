package BigNumber;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger n1 = sc.nextBigInteger();
		BigInteger n2 = sc.nextBigInteger();

		System.out.println(n1.add(n2));
		System.out.println(n1.multiply(n2));

	}
}
