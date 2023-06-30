package first;

import java.util.*;

public class BlackJack {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int[] cards = new int[n];

		for (int i = 0; i < n; i++)
			cards[i] = s.nextInt();

		int maxSum = 0;
		Arrays.sort(cards);

		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					int sum = cards[i] + cards[j] + cards[k];
					if (sum == m) {
						System.out.println(sum);
						return;
					}
					if (sum < m && sum > maxSum)
						maxSum = sum;
				}
			}
		}
		System.out.println(maxSum);
		s.close();
	}
}
