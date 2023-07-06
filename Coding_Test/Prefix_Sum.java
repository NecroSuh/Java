package first;

import java.util.Scanner;

public class Prefix_Sum {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = s.nextInt();

		int maxSum = arr[0];
		int currentSum = arr[0];

		for (int i = 1; i < n; i++) {
			currentSum = Math.max(currentSum + arr[i], arr[i]);
			maxSum = Math.max(maxSum, currentSum);
		}
		System.out.println(maxSum);
		s.close();
	}
}
