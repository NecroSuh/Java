package One;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x, y;
		System.out.print("�� (x,y)�� ��ǥ�� �Է��Ͻÿ�>>");
		x = s.nextInt();
		y = s.nextInt();

		if ((x >= 100 && x <= 200) && (y >= 100 && y <= 200))
			System.out.println("(" + x + "," + y + ")" + "�� �簢�� �ȿ� �ֽ��ϴ�.");

		s.close();
	}
}
