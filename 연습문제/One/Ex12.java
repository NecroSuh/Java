package One;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		System.out.print("����>>");
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		String s = in.next();
		int b = in.nextInt();
		int ans = 0;
		if (s.equals("+")) {
			ans = a + b;
		} else if (s.equals("-")) {
			ans = a - b;
		} else if (s.equals("*")) {
			ans = a * b;
		} else if (s.equals("/")) {
			if (b == 0) {
				System.out.print("0���� ���� �� �����ϴ�.");
				in.close();
				return;
			} else {
				ans = a / b;
			}
		} else {
			System.out.print("�߸��� �Է��Դϴ�.");
			in.close();
			return;
		}
		System.out.print(a + s + b + "�� ��� ����� " + ans);

		in.close();
	}
}
