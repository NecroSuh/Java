package second;

import java.util.Scanner;

public class MenOfPassion {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int count = 1;
		int degree = 0;

		while (n > 1) {
			n /= 2;
			count++;
			degree++;
		}
		if (degree > 3)
			degree = 4;

		System.out.println(count);
		System.out.println(degree);

		s.close();
	}
}
