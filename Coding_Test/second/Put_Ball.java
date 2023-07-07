package second;

import java.util.Scanner;

public class Put_Ball {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();

		int[] basket = new int[n + 1];

		for (int i = 1; i <= m; i++) {
			int start = s.nextInt();
			int end = s.nextInt();
			int number = s.nextInt();

			for (int j = start; j <= end; j++)
				basket[j] = number;
		}
		for (int i = 1; i <= n; i++)
			System.out.print(basket[i] + " ");

		s.close();
	}
}
