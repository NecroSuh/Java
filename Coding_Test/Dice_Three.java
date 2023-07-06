package first;

import java.util.Scanner;

public class Dice_Three {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int d1 = s.nextInt();
		int d2 = s.nextInt();
		int d3 = s.nextInt();

		int Money;

		if (d1 == d2 && d2 == d3)
			Money = 10000 + d1 * 1000;
		else if (d1 == d2 || d1 == d3 || d2 == d3) {
			if (d1 == d2)
				Money = 1000 + d1 * 100;
			else if (d1 == d3)
				Money = 1000 + d3 * 100;
			else
				Money = 1000 + d2 * 100;
		} else {
			int maxDice = Math.max(d1, Math.max(d2, d3));
			Money = maxDice * 100;
		}
		System.out.println(Money);
		s.close();
	}
}
