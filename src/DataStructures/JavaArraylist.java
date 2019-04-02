package DataStructures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class JavaArraylist {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int lines1 = in.nextInt();
		HashMap<Integer, List<Integer>> hash = new HashMap<>();
		for (int i = 1; i <= lines1; i++) {
			List<Integer> numers = new ArrayList<>();
			int coluns1 = in.nextInt();
			for (int j = 0; j < coluns1; j++) {
				numers.add(in.nextInt());
			}
			hash.put(i, numers);
		}
		int lines2 = in.nextInt();

		for (int i = 0; i < lines2; i++) {
			int line1 = in.nextInt();
			int colum1 = in.nextInt();
			if (colum1 > hash.get(line1).size()) {
				System.out.println("ERROR!");
			} else {
				System.out.println(hash.get(line1).get(colum1 - 1));
			}

		}

	}

}
