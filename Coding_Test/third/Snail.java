package third;

import java.util.Scanner;

public class Snail {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int up = s.nextInt();
		int down = s.nextInt();
		int length = s.nextInt();

		int day = (length - down) / (up - down);

		if ((length - down) % (up - down) != 0)
			day++;
		System.out.println(day);
		s.close();
	}
}
