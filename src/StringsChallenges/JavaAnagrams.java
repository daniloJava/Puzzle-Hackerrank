package StringsChallenges;

import java.util.Arrays;
import java.util.Scanner;

public class JavaAnagrams {

	static boolean isAnagram(String a, String b) {
		char[] word1 = a.replaceAll("[\\s]", "").toLowerCase().toCharArray();
		char[] word2 = b.replaceAll("[\\s]", "").toLowerCase().toCharArray();
		Arrays.sort(word1);
		Arrays.sort(word2);
		return Arrays.equals(word1, word2);
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println(ret ? "Anagrams" : "Not Anagrams");
	}
}
