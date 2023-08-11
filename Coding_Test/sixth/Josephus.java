package sixth;

import java.util.*;

public class Josephus {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Queue<Integer> q = new LinkedList<>();

		int n = s.nextInt();
		int k = s.nextInt();

		for (int i = 1; i <= n; i++)
			q.add(i);
		StringBuilder sb = new StringBuilder();
		sb.append('<');

		while (q.size() > 1) {
			for (int i = 0; i < k - 1; i++) {
				int val = q.poll();
				q.offer(val);
			}
			sb.append(q.poll()).append(", ");
		}
		sb.append(q.poll()).append('>');
		System.out.println(sb);
		s.close();
	}
}
