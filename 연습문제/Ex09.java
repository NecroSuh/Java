package One;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("���� �߽ɰ� ������ �Է�>>");
		double p1 = s.nextDouble();
		double p2 = s.nextDouble();
		double r = s.nextDouble();

		System.out.print("�� �Է�>>");
		double d1 = s.nextDouble();
		double d2 = s.nextDouble();

		double distance = Math.sqrt((d1 - p1) * (d1 - p1) + (d2 - p2) * (d2 - p2));

		if (distance < r)
			System.out.print("�� (" + d1 + ", " + d2 + ")�� �� �ȿ� �ִ�.");
		else
			System.out.print("�� (" + d1 + ", " + d2 + ")�� �� �ۿ� �ִ�.");

		s.close();
	}

}
