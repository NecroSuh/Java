package five;

import java.util.Scanner;

public class Ex58 {
	public static void main(String[] args) {
		System.out.print(">> ");
		Scanner s = new Scanner(System.in);
		String text = s.nextLine();
		StringBuffer sb = new StringBuffer(text);

		while (true) {
			System.out.print("���: ");
			String cmd = s.nextLine();
			if (cmd.equals("�׸�")) {
				System.out.print("�����մϴ�.");
				break;
			}
			String[] tokens = cmd.split("!");
			if (tokens.length != 2)
				System.out.println("�߸��� ����Դϴ�!");
			else {
				if (tokens[0].length() == 0 || tokens[1].length() == 0) {
					System.out.println("�߸��� ����Դϴ�!");
					continue;
				}
				int index = sb.indexOf(tokens[0]);
				if (index == -1) {
					System.out.println("ã�� �� �����ϴ�!");
					continue;
				}
				sb.replace(index, index + tokens[0].length(), tokens[1]);
				System.out.println(sb.toString());
			}
		}
		s.close();
	}
}
