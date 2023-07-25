package fourth;

import java.util.Scanner;

public class C_C {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String[] a = s.next().split("");
		int b = s.nextInt();

		System.out.println(a[b - 1]);
		s.close();
	}
}
