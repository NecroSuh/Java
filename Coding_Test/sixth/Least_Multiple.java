package sixth;

import java.util.Scanner;

public class Least_Multiple {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < n; i++) {
			int a = s.nextInt();
			int b = s.nextInt();

			int d = gcd(a, b);
			sb.append(a * b / d).append('\n');
		}
		System.out.println(sb);
		s.close();
	}

	public static int gcd(int a, int b) {
		while (b != 0) {
			int r = a % b;

			a = b;
			b = r;
		}
		return a;
	}
}
