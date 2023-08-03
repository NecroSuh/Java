package fifth;

import java.util.*;

public class C_C {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		int[] origin = new int[n];
		int[] sorted = new int[n];
		HashMap<Integer, Integer> ranking = new HashMap<Integer, Integer>();

		for (int i = 0; i < n; i++)
			sorted[i] = origin[i] = s.nextInt();
		Arrays.sort(sorted);

		int rank = 0;
		for (int v : sorted)
			if (!ranking.containsKey(v)) {
				ranking.put(v, rank);
				rank++;
			}

		StringBuilder sb = new StringBuilder();
		for (int key : origin) {
			int r = ranking.get(key);
			sb.append(r).append(' ');
		}
		System.out.println(sb);
		s.close();
	}
}
