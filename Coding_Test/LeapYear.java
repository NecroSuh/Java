package first;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int year = s.nextInt();
		int LY;

		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
			LY = 1;
		else
			LY = 0;

		System.out.println(LY);
		s.close();
	}
}
