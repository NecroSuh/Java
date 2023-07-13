package third;

import java.util.ArrayList;
import java.util.Scanner;

public class Measure {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();

		ArrayList<Integer> d = new ArrayList<>();

		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				d.add(i);
		}
		if (k <= d.size())
			System.out.println(d.get(k - 1));
		else
			System.out.println(0);

		s.close();
	}
}
