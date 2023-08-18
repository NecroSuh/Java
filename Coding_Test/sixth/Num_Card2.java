package sixth;

import java.util.*;

public class Num_Card2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = s.nextInt();

		Arrays.sort(arr);

		int m = s.nextInt();

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < m; i++) {
			int key = s.nextInt();
			sb.append(up(arr, key) - low(arr, key)).append(' ');
		}
		System.out.println(sb);
		s.close();
	}

	private static int low(int[] arr, int key) {
		int l = 0;
		int h = arr.length;

		while (l < h) {
			int mid = (l + h) / 2;
			if (key <= arr[mid])
				h = mid;
			else
				l = mid + 1;
		}
		return l;
	}

	private static int up(int[] arr, int key) {
		int l = 0;
		int h = arr.length;

		while (l < h) {
			int mid = (l + h) / 2;
			if (key < arr[mid])
				h = mid;
			else
				l = mid + 1;
		}
		return l;
	}
}
