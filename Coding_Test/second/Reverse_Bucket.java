package second;

import java.util.Scanner;

public class Reverse_Bucket {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();

		int[] bucket = new int[n];
		for (int i = 0; i < n; i++)
			bucket[i] = i + 1;

		for (int i = 0; i < m; i++) {
			int start = s.nextInt();
			int end = s.nextInt();

			RB(bucket, start, end);
		}

		for (int i = 0; i < n; i++)
			System.out.print(bucket[i] + " ");
		s.close();
	}

	private static void RB(int[] bucket, int start, int end) {
		while (start < end) {
			int temp = bucket[start - 1];
			bucket[start - 1] = bucket[end - 1];
			bucket[end - 1] = temp;

			start++;
			end--;
		}
	}
}
