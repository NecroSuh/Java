package fourth;

import java.util.Scanner;

public class Asymptotic_Notation {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int f1 = s.nextInt();
		int f2 = s.nextInt();
		int c = s.nextInt();
		int n = s.nextInt();

		int a = f1 * n + f2;
		int b = c * n;

		if (a <= b && f1 <= c)
			System.out.println(1);
		else
			System.out.println(0);

		s.close();
	}
}
