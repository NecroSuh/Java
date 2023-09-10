package sixth;

import java.util.Scanner;

public class Least_Multiple2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		long num1 = s.nextLong();
		long num2 = s.nextLong();

		long gcd = getGCD(Math.max(num1, num2), Math.min(num1, num2));

		System.out.println((num1 * num2) / gcd);
		s.close();
	}

	public static long getGCD(long a, long b) {
		while (b > 0) {
			long tmp = a;
			a = b;
			b = tmp % b;
		}
		return a;
	}
}
