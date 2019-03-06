package DataStructures;

import java.util.Scanner;

public class Java2DArray {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int[][] a = new int[6][6];
		int maxSum = Integer.MIN_VALUE;

		for (int i = 0; i < 6; i++) {
			String[] arrRowItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int j = 0; j < 6; j++) {
				int arrItem = Integer.parseInt(arrRowItems[j]);
				a[i][j] = arrItem;
				if (i > 1 && j > 1) {
					int sum = a[i][j] + a[i][j - 1] + a[i][j - 2] + a[i - 1][j - 1] + a[i - 2][j] + a[i - 2][j - 1] + a[i - 2][j - 2];
					if (sum > maxSum) {
						maxSum = sum;
					}
				}
			}
		}
		System.out.println(maxSum);
		scanner.close();
	}

}
