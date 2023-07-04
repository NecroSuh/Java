package first;

import java.util.Scanner;

public class Fibonacci {
	static int c1 = 0;
	static int c2 = 0;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.close();

		fibo(n);
		fibocount(n);

		System.out.println(c1 + " " + c2);
	}

	public static int fibo(int n) {

		if (n == 1 || n == 2) {
			c1++;
			return 1;
		} else
			return (fibo(n - 1) + fibo(n - 2));
	}

	public static int fibocount(int n) {
		int[] f = new int[n + 1];
		f[1] = f[2] + 1;

		for (int i = 3; i <= n; i++) {
			c2++;
			f[i] = f[i - 1] + f[i - 2];
		}
		return f[n];
	}
}
