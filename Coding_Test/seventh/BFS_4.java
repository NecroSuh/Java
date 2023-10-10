package seventh;

import java.io.*;
import java.util.*;

public class BFS_4 {
	static ArrayList<ArrayList<Integer>> list = new ArrayList<>();
	static long visited[];
	static long seq[];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		int start = Integer.parseInt(st.nextToken());

		seq = new long[m + 1];
		visited = new long[m + 1];
		for (int i = 1; i <= m; i++)
			visited[i] = -1;
		for (int i = 0; i <= m; i++)
			list.add(new ArrayList<>());
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			list.get(a).add(b);
			list.get(b).add(a);
		}
		for (int i = 1; i <= m; i++) {
			var pos = list.get(i);
			Collections.sort(pos);
		}
		bfs(start, m);

		long ans = 0;
		for (int i = 1; i <= m; i++)
			ans += seq[i] * visited[i];
		System.out.println(ans);
	}

	public static void bfs(int start, int m) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(start);
		visited[start] = 0;

		int seqCnt = 1;
		seq[start] = seqCnt++;

		while (!queue.isEmpty()) {
			int cur = queue.poll();

			for (int num : list.get(cur)) {
				if (visited[num] == -1) {
					queue.add(num);
					visited[num] = visited[cur] + 1;
					seq[num] = seqCnt++;
				}
			}
		}
	}
}
