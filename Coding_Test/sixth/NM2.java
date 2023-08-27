package sixth;

import java.util.Scanner;

public class NM2 {

	public static int[] arr;
	public static int n, m;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		n = s.nextInt();
		m = s.nextInt();

		arr = new int[m];

		dfs(1, 0);
		s.close();
	}

	public static void dfs(int a, int d) {
		if (d == m) {
			for (int val : arr)
				System.out.print(val + " ");
			System.out.println();
			return;
		}
		for (int i = a; i <= n; i++) {
			arr[d] = i;
			dfs(i + 1, d + 1);
		}
	}
}
