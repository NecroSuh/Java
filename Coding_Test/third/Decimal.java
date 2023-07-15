package third;

import java.util.Scanner;

public class Decimal {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int count = 0;

		for (int i = 0; i < n; i++) {
			int num = s.nextInt();
			if (isPrime(num))
				count++;
		}
		System.out.println(count);
		s.close();
	}

	public static boolean isPrime(int num) {
		if (num < 2)
			return false;
		for (int i = 2; i <= Math.sqrt(num); i++)
			if (num % i == 0)
				return false;
		return true;
	}
}
