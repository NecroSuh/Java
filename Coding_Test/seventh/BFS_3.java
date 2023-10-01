package seventh;

import java.io.*;
import java.util.*;

public class BFS_3 {
	private static BufferedReader br;
	private static StringTokenizer st;
	private static int n, m, r;
	private static List<Integer>[] list;

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		r = Integer.parseInt(st.nextToken());

		list = new ArrayList[n + 1];
		for (int i = 1; i <= n; i++)
			list[i] = new ArrayList<>();
		for (int i = 1; i <= m; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			list[u].add(v);
			list[v].add(u);
		}
		bfs(r);
	}

	private static void bfs(int r) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(r);

		boolean[] visited = new boolean[n + 1];
		visited[r] = true;

		int dep = 0;
		int[] depth = new int[n + 1];
		for (int i = 1; i <= n; i++)
			depth[i] = -1;
		while (!queue.isEmpty()) {
			int size = queue.size();
			while (size-- > 0) {
				int q = queue.poll();
				depth[q] = dep;
				for (int i : list[q]) {
					if (!visited[i]) {
						visited[i] = true;
						queue.add(i);
					}
				}
			}
			dep++;
		}
		for (int i = 1; i <= n; i++)
			System.out.println(depth[i]);
	}
}
