package first;

import java.util.Scanner;

public class Func {
	static int[][][] cache = new int[101][101][101];

	static int w(int a, int b, int c) {
		if (a <= 0 || b <= 0 || c <= 0)
			return 1;
		if (a > 50 || b > 50 || c > 50)
			return w(20, 20, 20);
		if (cache[a][b][c] != 0)
			return cache[a][b][c];
		if (a < b && b < c)
			return cache[a][b][c] = w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c);
		return cache[a][b][c] = w(a - 1, b, c) + w(a - 1, b - 1, c) + w(a - 1, b, c - 1) - w(a - 1, b - 1, c - 1);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		while (true) {
			int a = s.nextInt();
			int b = s.nextInt();
			int c = s.nextInt();

			if (a == -1 && b == -1 && c == -1)
				break;

			int result = w(a, b, c);
			System.out.println("w(" + a + ", " + b + ", " + c + ")= " + result);
		}
		s.close();
	}
}
