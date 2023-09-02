package sixth;

import java.util.Scanner;

public class Fraction_Sum {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int c1, c2, p1, p2;

		c1 = s.nextInt();
		p1 = s.nextInt();
		c2 = s.nextInt();
		p2 = s.nextInt();

		c1 = c1 * p2 + c2 * p1;
		p1 = p1 * p2;
		int god = getGod(c1, p1);

		System.out.println(c1 / god + " " + p1 / god);
		s.close();
	}

	public static int getGod(int a, int b) {
		if (a % b == 0)
			return b;
		return getGod(b, a % b);
	}
}
