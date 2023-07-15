package third;

import java.util.Scanner;

public class Prime_Factorization {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		for (int i = 2; i <= n; i++) {
			while (n % i == 0) {
				System.out.println(i);
				n /= i;
			}
		}
		s.close();
	}
}
