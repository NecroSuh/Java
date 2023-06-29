package first;

import java.util.Scanner;

public class Suger_Factory {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int count = 0;

		while (n % 5 != 0 && n >= 3) {
			n -= 3;
			count++;
		}

		if (n % 5 == 0) {
			count += n / 5;
		} else if (n % 5 != 0 && n % 3 != 0) {
			count = -1;
		}
		System.out.println(count);

		s.close();
	}
}
