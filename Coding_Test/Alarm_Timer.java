package first;

import java.util.Scanner;

public class Alarm_Timer {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int Hour = s.nextInt();
		int Min = s.nextInt();

		if (Min >= 45)
			Min -= 45;
		else {
			Min += 15;
			if (Hour == 0)
				Hour = 23;
			else
				Hour--;
		}
		System.out.println(Hour + " " + Min);
		s.close();
	}
}
