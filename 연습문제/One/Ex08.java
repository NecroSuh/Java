package One;

import java.util.Scanner;

public class Ex08 {
	public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
		if ((x >= rectx1 && x <= rectx2) && (y >= recty1 && y <= recty2))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("(x1, y1)�� ��ǥ�� �Է��Ͻÿ�>>");
		int x1 = s.nextInt();
		int y1 = s.nextInt();

		System.out.print("(x2, y2)�� ��ǥ�� �Է��Ͻÿ�>>");
		int x2 = s.nextInt();
		int y2 = s.nextInt();

		if (inRect(x1, y1, 100, 100, 200, 200) || inRect(x2, y2, 100, 100, 200, 200))
			System.out.println("�� �簢���� �浹�մϴ�.");
		else
			System.out.println("�� �簢���� �浹�����ʽ��ϴ�.");

		s.close();
	}
}