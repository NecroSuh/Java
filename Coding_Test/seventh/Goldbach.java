package seventh;

import java.io.*;

public class Goldbach {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		boolean prime[] = new boolean[1000001];
		prime[0] = prime[1];
		for (int i = 2; i < prime.length; i++) {
			if (!prime[i]) {
				for (int j = i + i; j < prime.length; j += i)
					prime[j] = true;
			}
		}
		int n = Integer.parseInt(br.readLine());

		while (n != 0) {
			boolean isPrive = false;
			for (int i = 2; i <= n; i++) {
				if (!prime[i] && !prime[n - i]) {
					System.out.println(n + " = " + i + " + " + (n - i));
					isPrive = true;
					break;
				}
			}
			if (!isPrive)
				System.out.println("Goldbach's conjecture is wrong.");
			n = Integer.parseInt(br.readLine());
		}
	}
}
