package One;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("���� 3���� �Է��Ͻÿ�>>");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();

		if ((a > b + c)||(b > a + c)|| (c > a + b))
			System.out.println("�ﰢ���� �� �� �����ϴ�.");
		else
			System.out.println("�ﰢ���� �˴ϴ�.");
		s.close();
	}
}
