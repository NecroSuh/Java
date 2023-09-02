package sixth;

import java.io.*;
import java.util.*;

public class Avenue {
	static int[] tree;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		tree = new int[n];
		for (int i = 0; i < n; i++)
			tree[i] = Integer.parseInt(br.readLine());
		Arrays.sort(tree);
		int god = 0;
		for (int i = 0; i < n - 1; i++) {
			int distance = tree[i + 1] - tree[i];
			god = g(distance, god);
		}
		System.out.println((tree[n - 1] - tree[0]) / god + 1 - (tree.length));
	}

	static int g(int a, int b) {
		if (b == 0)
			return a;
		else
			return g(b, a % b);
	}
}
