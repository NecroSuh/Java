package One;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("ù��° ���� �߽ɰ� ������ �Է�>>");
		int x1 = s.nextInt();
		int y1 = s.nextInt();
		double r1 = s.nextInt();

		System.out.print("�ι�° ���� �߽ɰ� ������ �Է�>>");
		int x2 = s.nextInt();
		int y2 = s.nextInt();
		double r2 = s.nextInt();

		double d = Math.sqrt((x1 - y1) * (x1 - y1) + (x2 - y2) * (x2 - y2));

		if (d <= r1 + r2)
			System.out.println("�� ���� ���� ��ģ��.");
		else
			System.out.println("�� ���� ���� ��ġ�� �ʴ´�.");

		s.close();
	}
}
