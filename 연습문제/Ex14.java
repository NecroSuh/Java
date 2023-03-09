package two;

import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("정수를 입력하시오>>");
		int n = s.nextInt();

		for (int i = n; i > 0; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		s.close();
	}
}
