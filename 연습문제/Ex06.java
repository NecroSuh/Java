package One;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("1~99 사이의 정수를 입력하시오>>");
		int num = s.nextInt();

		if (num == 3 || num == 6 || num == 9)
			System.out.print("박수짝");
		else if (num >= 10)
			if ((num % 10) == 3 || (num % 10) == 6 || (num % 10) == 9)
				if (num / 10 == 3 || num / 10 == 6 || num / 10 == 9)
					System.out.print("박수짝짝");
				else
					System.out.print("박수짝");
			else if (num / 10 == 3 || num / 10 == 6 || num / 10 == 9)
				System.out.print("박수짝");

		s.close();
	}
}
