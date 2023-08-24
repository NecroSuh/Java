package sixth;

import java.io.*;
import java.util.*;

public class Shuffle_Card {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] p = new int[n];
		int[] order = new int[n];
		int[] card = new int[n];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++)
			p[i] = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			order[Integer.parseInt(st.nextToken())] = i;
			card[i] = i % 3;
		}
		int[] compare = card.clone();
		int[] next = new int[n];

		int result = 0;
		while (!Arrays.equals(card, p) && !(result != 0 && Arrays.equals(card, compare))) {
			for (int j = 0; j < n; j++)
				next[order[j]] = card[j];
			card = next.clone();
			result++;
		}
		if (result != 0 && Arrays.equals(card, compare))
			System.out.println(-1);
		else
			System.out.println(result);
	}
}
