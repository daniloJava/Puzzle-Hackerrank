package StringsChallenges;

import java.util.Scanner;

public class JavaStringTokens {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		// Write your code here.

		String[] split = s.trim().split("[ !,?._'@]+");
		if (split.length == 1 && split[0].isEmpty()) {
			System.out.println(0);
		} else {
			System.out.println(split.length);
			for (String element : split) {
				System.out.println(element);
			}
		}

		scan.close();

	}

}
