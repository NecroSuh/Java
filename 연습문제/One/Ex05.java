package One;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("정수 3개를 입력하시오>>");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();

		if ((a > b + c)||(b > a + c)|| (c > a + b))
			System.out.println("삼각형이 될 수 없습니다.");
		else
			System.out.println("삼각형이 됩니다.");
		s.close();
	}
}
