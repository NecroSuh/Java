package sixth;

import java.io.*;
import java.util.*;

public class Snack_Share {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		Queue<Integer> q = new LinkedList<>();
		Stack<Integer> s = new Stack<>();

		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; i++)
			q.offer(Integer.parseInt(st.nextToken()));
		int start = 1;
		while (!q.isEmpty()) {
			if (q.peek() == start) {
				q.poll();
				start++;
			} else if (!s.isEmpty() && s.peek() == start) {
				s.pop();
				start++;
			} else
				s.push(q.poll());
		}
		while (!s.isEmpty()) {
			if (s.peek() == start) {
				s.pop();
				start++;
			} else {
				System.out.println("Sad");
				return;
			}
		}
		System.out.println("Nice");
	}
}
