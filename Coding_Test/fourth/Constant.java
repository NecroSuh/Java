package fourth;

import java.util.Scanner;

public class Constant {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int a = s.nextInt();
		int b = s.nextInt();

		s.close();
		a = Integer.parseInt(new StringBuilder().append(a).reverse().toString());
		b = Integer.parseInt(new StringBuilder().append(b).reverse().toString());

		System.out.print(a > b ? a : b);
	}
}
