package DataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();

		List<Integer> numbers = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			numbers.add(in.nextInt());
		}

		int numberQueries = in.nextInt();
		for (int i = 0; i < numberQueries; i++) {
			if ("Insert".equalsIgnoreCase(in.next())) {
				int index = in.nextInt();
				int element = in.nextInt();
				numbers.add(index, element);
			} else {
				int index = in.nextInt();
				numbers.remove(index);
			}
		}
		numbers.forEach(n -> System.out.print(n + " "));
	}

}
