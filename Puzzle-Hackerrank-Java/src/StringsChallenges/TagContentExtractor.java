package StringsChallenges;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		ArrayList<String> lines = new ArrayList<>();
		Pattern pattern = Pattern.compile("<(.+?)>([^<>]+)</\\1>");
		while (testCases > 0) {
			boolean matchFound = false;
			String line = in.nextLine();
			Matcher m = pattern.matcher(line);
			while (m.find()) {
				matchFound = true;
				if (m.group(2).length() != 0) {
					lines.add(m.group(2));
				}
			}
			if (!matchFound) {
				lines.add("None");
			}
			// Write your code here
			testCases--;
		}
		lines.forEach(System.out::println);
	}
}
