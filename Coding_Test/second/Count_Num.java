package second;

import java.util.Scanner;

public class Count_Num {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] num = new int[n];

		for (int i = 0; i < n; i++)
			num[i] = s.nextInt();
		int v = s.nextInt();
		int count = c(num, v);

		System.out.println(count);
		s.close();
	}

	private static int c(int[] num, int v) {
		int count = 0;

		for (int i = 0; i < num.length; i++) {
			if (num[i] == v)
				count++;
		}
		return count;
	}
}
