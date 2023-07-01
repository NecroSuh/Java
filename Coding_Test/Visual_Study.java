package first;

import java.util.Scanner;

public class Visual_Study {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int d = s.nextInt();
		int e = s.nextInt();
		int f = s.nextInt();

		int x = (c * e - b * f) / (a * e - b * d);
		int y = (a * f - c * d) / (a * e - b * d);

		System.out.println(x + " " + y);

		s.close();
	}
}
