package third;

import java.util.Scanner;

public class Fibo {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(F(n));
	}

	static int F(int n) {
		if (n == 0)
			return 0;
		else if (n == 1)
			return 1;
		return F(n - 1) + F(n - 2);
	}
}
