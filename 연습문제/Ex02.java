package One;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("2�ڸ��� ���� �Է�(10~99)>>");
		int su = s.nextInt();
		if (su % 11 == 0)
			System.out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
		s.close();
	}
}
