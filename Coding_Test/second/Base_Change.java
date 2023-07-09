package second;

import java.util.Scanner;

public class Base_Change {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String n = s.next();
		int b = s.nextInt();

		int decimal = 0;
		int power = 1;

		for (int i = n.length() - 1; i >= 0; i--) {
			char digit = n.charAt(i);
			int value;

			if (Character.isDigit(digit))
				value = digit - '0';
			else
				value = digit - 'A' + 10;

			decimal += value * power;
			power *= b;
		}
		System.out.println(decimal);
		s.close();
	}
}
