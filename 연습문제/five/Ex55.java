package five;

import java.util.Scanner;

public class Ex55 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("���ڿ��� �Է��ϼ���. ��ĭ�̳� �־ �ǰ� ���� �ѱ� ��� �˴ϴ�.");
		String sc = s.nextLine();
		for (int i = 0; i < sc.length(); i++) {
			System.out.print(sc.substring(i));
			System.out.println(sc.substring(0, i));
		}
		s.close();
	}
}
