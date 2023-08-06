package fifth;

import java.io.*;
import java.util.*;

public class Spin_Queue {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		LinkedList<Integer> Deq = new LinkedList<Integer>();

		for (int i = 1; i <= n; i++)
			Deq.add(i);
		int count = 0;

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; i++) {
			int num = Integer.parseInt(st.nextToken());

			while (Deq.getFirst() != num) {
				if (Deq.indexOf(num) <= (Deq.size() / 2)) {
					Deq.addLast(Deq.getFirst());
					Deq.removeFirst();
				} else {
					Deq.addFirst(Deq.getLast());
					Deq.removeLast();
				}
				count++;
			}
			if (Deq.getFirst() == num)
				Deq.removeFirst();
		}
		System.out.println(count);
	}
}
