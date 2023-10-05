package seventh;

import java.io.*;
import java.util.*;

public class Cow3 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;

	static class Cow implements Comparable<Cow> {
		int start, time;

		public Cow(int start, int time) {
			super();
			this.start = start;
			this.time = time;
		}

		@Override
		public int compareTo(Cow o) {
			if (this.start != o.start)
				return this.start - o.start;
			return this.time - o.time;
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		int n = Integer.parseInt(br.readLine());
		Cow[] c = new Cow[n];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int time = Integer.parseInt(st.nextToken());

			c[i] = new Cow(start, time);
		}
		Arrays.sort(c);

		int cnt = 0;
		for (int i = 0; i < n; i++) {
			Cow cur = c[i];
			if (cur.start > cnt)
				cnt = cur.start + cur.time;
			else
				cnt += cur.time;
		}
		System.out.println(cnt);
	}
}
