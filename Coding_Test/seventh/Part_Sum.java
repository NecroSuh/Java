package seventh;

import java.io.*;
import java.util.*;

public class Part_Sum {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken()); 
		int M = Integer.parseInt(st.nextToken()); 
		int K = Integer.parseInt(st.nextToken()); 

		long[] arr = new long[N + 1];

		for (int i = 1; i <= N; i++) {
			arr[i] = Long.parseLong(br.readLine());
		}

		SegmentTree segment = new SegmentTree(arr);
		segment.init(1, 1, N);

		for (int i = 0; i < M + K; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			long c = Long.parseLong(st.nextToken());

			if (a == 1) {
				segment.update(1, 1, N, b, c - segment.getArr()[b]);
				segment.updateArr(b, c);
			} else {
				System.out.println(segment.sum(1, 1, N, b, (int) c));
			}
		}

		br.close();
	}
}

class SegmentTree {
	private long[] tree;
	private long[] arr;

	public SegmentTree(long[] arr) {
		int height = (int) Math.ceil(Math.log(arr.length - 1) / Math.log(2));

		tree = new long[(int) Math.pow(2, height + 1)];
		this.arr = arr;
	}

	public long init(int node, int start, int end) {
		if (start == end) {
			return this.tree[node] = this.arr[start];
		}

		return this.tree[node] = init(node * 2, start, (start + end) / 2)
				+ init(node * 2 + 1, (start + end) / 2 + 1, end);
	}

	public void update(int node, int start, int end, int idx, long diff) {
		if (idx < start || end < idx) {
			return;
		}

		this.tree[node] += diff;

		if (start != end) {
			update(node * 2, start, (start + end) / 2, idx, diff);
			update(node * 2 + 1, (start + end) / 2 + 1, end, idx, diff);
		}
	}

	public long sum(int node, int start, int end, int left, int right) {
		if (left > end || right < start) {
			return 0;
		}

		if (left <= start && end <= right) {
			return this.tree[node];
		}

		return sum(node * 2, start, (start + end) / 2, left, right)
				+ sum(node * 2 + 1, (start + end) / 2 + 1, end, left, right);
	}

	public long[] getArr() {
		return this.arr;
	}

	public void updateArr(int idx, long value) {
		this.arr[idx] = value;
	}
}
