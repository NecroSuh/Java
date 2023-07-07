package second;

import java.util.Scanner;

public class Change_Ball {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();

		int[] basket = new int[n + 1];

		for (int i = 1; i <= n; i++)
			basket[i] = i;

		for (int i = 0; i < m; i++) {
			int swap1 = s.nextInt();
			int swap2 = s.nextInt();

			int temp = basket[swap1];
			basket[swap1] = basket[swap2];
			basket[swap2] = temp;
		}
		for (int i = 1; i <= n; i++)
			System.out.print(basket[i] + " ");
		s.close();
	}
}
