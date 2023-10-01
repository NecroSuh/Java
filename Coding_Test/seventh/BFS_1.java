package seventh;

import java.io.*;
import java.util.*;

public class BFS_1 {
	static int n, m;
	static List<List<Integer>> I = new ArrayList<>();
	static int[] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());

		visited = new int[n + 1];
		for (int i = 0; i <= n; i++)
			I.add(new ArrayList<>());
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			I.get(a).add(b);
			I.get(b).add(a);
		}
		for (int i = 1; i <= n; i++)
			Collections.sort(I.get(i));
		bfs(r);
		for (int i = 1; i <= n; i++)
			System.out.println(visited[i]);
	}

	static void bfs(int start) {
		Queue<Integer> q = new LinkedList<>();
		int cnt = 1;

		q.offer(start);
		visited[start] = cnt++;
		while (!q.isEmpty()) {
			int a = q.poll();
			for (int i = 0; i < I.get(a).size(); i++) {
				int nextV = I.get(a).get(i);
				if (visited[nextV] != 0)
					continue;
				q.offer(nextV);
				visited[nextV] = cnt++;
			}
		}
	}
}
