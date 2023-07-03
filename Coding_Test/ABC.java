package first;

import java.util.Scanner;

public class ABC {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long a = s.nextLong();
		long b = s.nextLong();
		long c = s.nextLong();

		s.close();

		long sum = a + b + c;
		System.out.println(sum);
	}

}
