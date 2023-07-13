package third;

import java.util.ArrayList;
import java.util.Scanner;

public class Measure_Add {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		while (true) {
			int n = s.nextInt();

			if (n == -1)
				break;

			ArrayList<Integer> d = new ArrayList<>();
			int sum = 0;

			for (int i = 1; i < n; i++) {
				if (n % i == 0) {
					d.add(i);
					sum += i;
				}
			}
			if (sum == n) {
				System.out.print(n + " = ");
				for (int i = 0; i < d.size(); i++) {
					System.out.print(d.get(i));
					if (i < d.size() - 1)
						System.out.print(" + ");
				}
				System.out.println();
			} else
				System.out.println(n + " is NOT perfect.");
		}
		s.close();
	}
}
