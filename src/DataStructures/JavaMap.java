package DataStructures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class JavaMap {

	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		in.nextLine();

		HashMap<String, Integer> bookPhones = new HashMap<>();
		for (int i = 0; i < size; i++) {
			String name = in.nextLine();
			int number = in.nextInt();
			bookPhones.put(name, number);
			in.nextLine();
		}

		List<String> found = new ArrayList<>();
		while (in.hasNext()) {
			String name = in.nextLine();
			found.add(Optional.ofNullable(bookPhones.get(name)).map(b -> name + "=" + b).orElse("Not found"));
		}
		found.forEach(System.out::println);
	}

}
