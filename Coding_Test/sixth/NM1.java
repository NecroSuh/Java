package sixth;

import java.util.*;

public class NM1 {
	public static int[] arr;
	public static boolean[] visit;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int m = s.nextInt();

		arr = new int[m];
		visit = new boolean[n];
		dfs(n, m, 0);
		s.close();
	}

	public static void dfs(int n, int m, int depth) {
		if (depth == m) {
			for (int val : arr)
				System.out.print(val + " ");
			System.out.println();
			return;
		}
		for (int i = 0; i < n; i++) {
			if (!visit[i]) {
				visit[i] = true;
				arr[depth] = i + 1;
				dfs(n, m, depth + 1);
				visit[i] = false;
			}
		}
	}
}
