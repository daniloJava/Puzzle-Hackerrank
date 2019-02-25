package BigNumber;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaPrimalityTest {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		String n = scanner.nextLine();
		BigInteger isPrime = new BigInteger(n);

		if (isPrime.isProbablePrime(1)) {
			System.out.print("prime");
		} else if (isPrime.isProbablePrime(0)) {
			System.out.print("not prime");
		}
		scanner.close();
	}
}
