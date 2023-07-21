package third;

import java.util.Scanner;

public class Fountain {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();

		int cross = 1, prev = 0;

		while (true) {
			if (x <= prev + cross) {
				if (cross % 2 == 1) {
					System.out.print((cross - (x - prev - 1)) + "/" + (x - prev));
					break;
				} else {
					System.out.print((x - prev) + "/" + (cross - (x - prev - 1)));
					break;
				}
			} else {
				prev += cross;
				cross++;
			}
		}
	}
}
