package fifth;

import java.io.*;
import java.util.*;

public class Find_SN {

	static String[] arr;
	static int[][] map;
	static int n, m;
	static int ans = -1;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		arr = new String[n + 1];
		map = new int[n][m];

		for (int i = 0; i < n; ++i) {
			arr[i] = br.readLine();
			for (int j = 0; j < m; ++j)
				map[i][j] = arr[i].charAt(j) - '0';
		}
		for (int i = 0; i < n; ++i)
			for (int j = 0; j < m; ++j)
				slv(j, i);
		System.out.println(ans);
	}

	public static void slv(int c, int r) {
		for (int i = -n; i < n; ++i)
			for (int j = -m; j < m; ++j) {
				if (i == 0 && j == 0)
					continue;
				int x = c;
				int y = r;

				int sqr = 0;
				while (0 <= x && x < m && 0 <= y && y < n) {
					sqr *= 10;
					sqr += map[y][x];

					int root = (int) Math.sqrt(sqr);
					if (Math.pow(root, 2) == sqr)
						ans = Math.max(ans, sqr);
					x += j;
					y += i;
				}
			}
	}
}
