package two;

import java.util.Scanner;

public class Ex15 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String a;	// ���ڿ� �б�
		char c;		// ���ڿ��� ù ��° ����
		System.out.print("�ҹ��� ���ĺ� �ϳ��� �Է��Ͻÿ�>>");
		a = s.next();
		c = a.charAt(0);

		for (int i = 0; i <= c - 'a'; i++) {
			for (char j = 'a'; j <= c - i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		s.close();
	}
}
