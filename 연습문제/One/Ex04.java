package One;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("���� 3�� �Է�>>");

		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();

		if ((b < a && a < c) || (c < b && a < b))
			System.out.println("�߰� ���� " + a);
		else if ((a < b && b < c) || (a < b && b < c))
			System.out.println("�߰� ���� " + b);
		else
			System.out.println("�߰� ���� " + c);

		s.close();
	}
}
