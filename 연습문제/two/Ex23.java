package two;

import java.util.Scanner;

public class Ex23 {
	public static void main(String[] args) {
		String course[] = { "Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�" };
		int score[] = { 95, 88, 76, 62, 55 };

		Scanner s = new Scanner(System.in);

		while (true) {
			System.out.print("���� �̸�>>");
			String a = s.next();
			if (a.equals("�׸�"))
				break;
			int f = 0;
			for (int i = 0; i < course.length; i++) {
				if (course[i].equals(a)) {
					System.out.println(course[i] + "�� ������ " + score[i]);
					f = 1;
				}
			}
			if (f == 0)
				System.out.println("���� �����Դϴ�.");
		}
		s.close();
	}
}
