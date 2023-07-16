package third;

import java.util.Scanner;

public class AandBsub7 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();

		for (int i = 1; i <= t; i++) {
			int a = s.nextInt();
			int b = s.nextInt();

			int sum = a + b;

			System.out.println("Case #" + i + ": " + sum);
		}
		s.close();
	}
}
