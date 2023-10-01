package seventh;

import java.io.*;
import java.util.*;

public class BFS_2 {
	private static BufferedReader br;
	private static StringTokenizer st;

	private static int n, m, r;
	private static List<Integer>[] list;

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		r = Integer.parseInt(st.nextToken());
		list = new ArrayList[n + 1];
		for (int i = 1; i <= n; i++)
			list[i] = new ArrayList<>();
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			list[u].add(v);
			list[v].add(u);
		}
		for (int i = 1; i <= n; i++)
			Collections.sort(list[i], Collections.reverseOrder());
		bfs(r);
	}

	private static void bfs(int x) {
		Queue<Integer> q = new LinkedList<>();
		q.add(x);

		boolean[] visited = new boolean[n + 1];
		visited[x] = true;

		int cnt = 0;
		int[] order = new int[n + 1];
		while (!q.isEmpty()) {
			int qu = q.poll();
			cnt++;
			order[qu] = cnt;

			for (int i : list[qu]) {
				if (!visited[i]) {
					visited[i] = true;
					q.add(i);
				}
			}
		}
		for (int i = 1; i <= n; i++)
			System.out.println(order[i]);
	}
}
