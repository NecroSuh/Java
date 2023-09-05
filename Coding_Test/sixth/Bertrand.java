package sixth;

import java.util.Scanner;

public class Bertrand {
	public static boolean[] prime = new boolean[246913];

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		get_prime();

		while (true) {
			int n = s.nextInt();
			if (n == 0)
				break;
			int count = 0;
			for (int i = n + 1; i <= 2 * n; i++)
				if (!prime[i])
					count++;
			System.out.println(count);
		}
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
