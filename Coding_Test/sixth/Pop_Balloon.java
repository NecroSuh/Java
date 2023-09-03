package sixth;

import java.util.*;

class Pop_Balloon {
	int index;
	int value;

	public Pop_Balloon(int index, int value) {
		this.index = index;
		this.value = value;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		Deque<Pop_Balloon> dq = new ArrayDeque<>();
		StringBuilder sb = new StringBuilder();

		for (int i = 1; i <= n; i++) {
			int value = s.nextInt();
			dq.add(new Pop_Balloon(i, value));
		}
		while (!dq.isEmpty()) {
			sb.append(dq.getFirst().index + " ");
			int next = dq.poll().value;
			if (dq.isEmpty())
				break;
			if (next > 0)
				for (int i = 0; i < next - 1; i++)
					dq.addLast(dq.pollFirst());
			else
				for (int i = 0; i < Math.abs(next); i++)
					dq.addFirst(dq.pollLast());
		}
		System.out.println(sb);
		s.close();
	}
}
