package two;

import java.util.Scanner;

public class Ex19 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("정수 몇개?");
		int n = s.nextInt();
		for (int i = 1; i <= n; i++) {
			int x = (int) (Math.random() * 100);
			System.out.print(x + " ");
			if (i % 10 == 0)
				System.out.println();
		}
		s.close();
	}
}
