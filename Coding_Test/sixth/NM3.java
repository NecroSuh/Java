package sixth;

import java.util.Scanner;

public class NM3 {

	public static int[] arr;
	public static int n, m;
	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		n = s.nextInt();
		m = s.nextInt();

		arr = new int[m];

		dfs(0);
		System.out.print(sb);
		s.close();
	}

	public static void dfs(int d) {
		if (d == m) {
			for (int i = 0; i < m; i++)
				sb.append(arr[i] + " ");
			sb.append('\n');
			return;
		}
		for (int i = 1; i <= n; i++) {
			arr[d] = i;
			dfs(d + 1);
		}
	}
}
