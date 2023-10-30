package eighth;

import java.util.Scanner;

public class Car_Num1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		int num = 1;

		String start = str.substring(0, 1);

		if (start.equals("c"))
			num *= 26;
		else
			num *= 10;

		for (int i = 0; i < str.length() - 1; i++) {
			String a = str.substring(i, i + 1);
			String b = str.substring(i + 1, i + 2);

			if (a.equals("c")) {
				if (a.equals(b))
					num *= 25;
				else
					num *= 10;
			} else if (a.equals("d")) {
				if (a.equals(b))
					num *= 9;
				else
					num *= 26;
			}
		}
		System.out.println(num);
		s.close();
	}
}
