package five;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex54 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.print(">>");
			String s1 = s.nextLine();
			if (s1.equals("�׸�")) {
				System.out.println("�����մϴ�...");
				break;
			}
			StringTokenizer st = new StringTokenizer(s1, " ");
			System.out.println("���� ������ " + st.countTokens());
		}
		s.close();
	}
}
