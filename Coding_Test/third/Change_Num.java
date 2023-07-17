package third;

import java.util.Scanner;

public class Change_Num {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int b = s.nextInt();

		String result = convert(n, b);
		System.out.println(result);
		s.close();
	}

	public static String convert(int n, int b) {
		StringBuilder sb = new StringBuilder();

		while (n > 0) {
			int remainder = n % b;
			if (remainder < 10)
				sb.insert(0, remainder);
			else {
				char c = (char) ('A' + (remainder - 10));
				sb.insert(0, c);
			}
			n /= b;
		}
		return sb.toString();
	}
}
