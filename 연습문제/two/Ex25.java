package two;

import java.util.Scanner;

public class Ex25 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str[] = { "����", "����", "��" };
		while (true) {
			int n = (int) (Math.random() * 3);
			System.out.print("���� ���� ��!>>");
			String pstr = s.next();
			if (pstr.equals("�׸�")) {
				System.out.print("������ �����մϴ�.");
				break;
			}
			if (str[n].equals(pstr))
				System.out.println("��ǻ�� = " + str[n] + ", ����� = " + pstr + ", �����ϴ�.");
			else {
				if (str[n].equals("����")) {
					if (pstr.equals("��"))
						System.out.println("��ǻ�� = " + str[n] + ", ����� = " + pstr + ", �̰���ϴ�.");
					else
						System.out.println("��ǻ�� = " + str[n] + ", ����� = " + pstr + ", �����ϴ�.");

				} else if (str[n].equals("����")) {
					if (pstr.equals("����"))
						System.out.println("��ǻ�� = " + str[n] + ", ����� = " + pstr + ", �̰���ϴ�.");
					else
						System.out.println("��ǻ�� = " + str[n] + ", ����� = " + pstr + ", �����ϴ�.");

				} else if (str[n].equals("��")) {
					if (pstr.equals("����"))
						System.out.println("��ǻ�� = " + str[n] + ", ����� = " + pstr + ", �̰���ϴ�.");
					else
						System.out.println("��ǻ�� = " + str[n] + ", ����� = " + pstr + ", �����ϴ�.");
				}
			}
		}
		s.close();
	}
}
