package third;

import java.util.Scanner;

public class Square_Round {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long n = s.nextInt();
		System.out.println(4 + (4 * (n - 1)));

		s.close();
	}
}
