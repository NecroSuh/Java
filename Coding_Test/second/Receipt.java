package second;

import java.util.Scanner;

public class Receipt {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int n = s.nextInt();

		int total = 0;

		for (int i = 0; i < n; i++) {
			int price = s.nextInt();
			int count = s.nextInt();

			total += price * count;
		}
		if (x == total)
			System.out.println("Yes");
		else
			System.out.println("No");

		s.close();
	}
}
