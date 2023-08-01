package fifth;

import java.util.Scanner;

public class SortInside {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int[] count = new int[10];

		int n = s.nextInt();

		while (n != 0) {
			count[n % 10]++;
			n /= 10;
		}
		for (int i = 9; i >= 0; i--)
			while (count[i]-- > 0)
				System.out.print(i);
		s.close();
	}
}
