package array;

import java.util.Scanner;

public class Ex05_09 {

	public static void main(String[] args) {
		String[][] words = { 	{ "chair", "����" },			// words[0][0], words[0][1]
								{ "computer", "��ǻ��" }, 	// words[1][0], words[1][1]
								{ "integer", "����" } };
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < words.length; i++) {
			System.out.printf("Q%d. %s�� ����?", i + 1, words[i][0]);

			String tmp = scan.nextLine();

			if (tmp.equals(words[i][1])) {
				System.out.printf("�����Դϴ�!%n%n");
			} else {
				System.out.printf("Ʋ�Ƚ��ϴ�. ������ %s�Դϴ�.%n%n", words[i][1]);
			}
		}
		scan.close();
	}
}
