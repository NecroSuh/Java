package One;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("��ȭ�� �Է��ϼ���(���� ��)>>");
		int i = s.nextInt();
		double d = i / 1100;
		System.out.printf("%d���� $%s�Դϴ�.", i, d);
		s.close();
	}
}
