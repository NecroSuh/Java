package fifth;

import java.util.*;

public class Room_Num {
	static int p[];
	static int n, m;

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		p = new int[n];
		for (int i = 0; i < n; i++)
			p[i] = s.nextInt();
		m = s.nextInt();
		int ans[] = new int[100];
		int cost = 0;
		int idx = 0;
		int minIdx = findMin(0);
		if (minIdx == 0) {
			minIdx = findMin(1);
			if (p[minIdx] <= m) {
				ans[idx++] = minIdx;
				cost += p[minIdx];
				minIdx = 0;
			} else {
				System.out.println(0);
				return;
			}
		}
		while (cost + p[minIdx] <= m) {
			ans[idx++] = minIdx;
			cost += p[minIdx];
		}
		for (int i = 0; i < idx; i++)
			for (int j = n - 1; j >= 0; j--) {
				if (cost - p[ans[i]] + p[j] <= m) {
					cost = cost - p[ans[i]] + p[j];
					ans[i] = j;
					break;
				}
			}
		for (int i = 0; i < idx; i++)
			System.out.print(ans[i]);
		s.close();
	}

	public static int findMin(int start) {
		int retIdx = 0, min = 100;
		for (int i = start; i < n; i++) {
			if (min > p[i]) {
				min = p[i];
				retIdx = i;
			}
		}
		return retIdx;
	}
}
