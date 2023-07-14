package third;

import java.util.Scanner;

public class Three_Remain {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();

		int result1 = (a + b) % c;
		int result2 = ((a % c) + (b % c)) % c;
		int result3 = (a * b) % c;
		int result4 = ((a % c) * (b % c)) % c;

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);

		s.close();
	}
}
