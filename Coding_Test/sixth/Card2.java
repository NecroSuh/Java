package sixth;

import java.util.*;

public class Card2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		Queue<Integer> q = new LinkedList<>();

		int n = s.nextInt();

		for (int i = 1; i <= n; i++)
			q.offer(i);
		while (q.size() > 1) {
			q.poll();
			q.offer(q.poll());
		}
		System.out.println(q.poll());
		s.close();
	}
}
