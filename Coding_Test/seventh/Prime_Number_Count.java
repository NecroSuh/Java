package seventh;

import java.util.Scanner;

public class Prime_Number_Count {
	public static boolean[] prime;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int n = s.nextInt();

		prime = new boolean[n + 1];
		get_prime();

		for (int i = m; i <= n; i++)
			if (!prime[i])
				System.out.println(i);
		s.close();
	}

	public static void get_prime() {
		prime[0] = prime[1] = true;

		for (int i = 2; i <= Math.sqrt(prime.length); i++) {
			if (prime[i])
				continue;
			for (int j = i * i; j < prime.length; j += i)
				prime[j] = true;
		}
	}
}
