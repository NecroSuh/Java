package One;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("1~99 ������ ������ �Է��Ͻÿ�>>");
		int num = s.nextInt();

		if (num == 3 || num == 6 || num == 9)
			System.out.print("�ڼ�¦");
		else if (num >= 10)
			if ((num % 10) == 3 || (num % 10) == 6 || (num % 10) == 9)
				if (num / 10 == 3 || num / 10 == 6 || num / 10 == 9)
					System.out.print("�ڼ�¦¦");
				else
					System.out.print("�ڼ�¦");
			else if (num / 10 == 3 || num / 10 == 6 || num / 10 == 9)
				System.out.print("�ڼ�¦");

		s.close();
	}
}
