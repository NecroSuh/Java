package third;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Num_Card {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		Set<Integer> card = new HashSet<>();
		for (int i = 0; i < n; i++)
			card.add(s.nextInt());

		int m = s.nextInt();
		for (int i = 0; i < m; i++) {
			int num = s.nextInt();
			if (card.contains(num))
				System.out.print("1 ");
			else
				System.out.print("0 ");
		}
		s.close();
	}
}
