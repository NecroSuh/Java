package fourth;

import java.util.Scanner;

public class Four_Point {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int[] code1 = { s.nextInt(), s.nextInt() };
		int[] code2 = { s.nextInt(), s.nextInt() };
		int[] code3 = { s.nextInt(), s.nextInt() };

		s.close();

		int x, y;
		if (code1[0] == code2[0])
			x = code3[0];
		else if (code1[0] == code3[0])
			x = code2[0];
		else
			x = code1[0];

		if (code1[1] == code2[1])
			y = code3[1];
		else if (code1[1] == code3[1])
			y = code2[1];
		else
			y = code1[1];

		System.out.println(x + " " + y);
	}
}
