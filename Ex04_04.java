package conditional;

import java.util.Scanner;

public class Ex04_04 {

	public static void main(String[] args) {
		System.out.print("���� ���� �Է��ϼ���.>");

		Scanner scan = new Scanner(System.in);
		int month = scan.nextInt();

		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println("������ ������ ���Դϴ�.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("������ ������ �����Դϴ�.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("���� ������ ���� �Դϴ�.");
			break;
		default:
			// case 12: case 1: case 2:
			System.out.println("������ ������ �ܿ��Դϴ�.");
		}
		scan.close();
	}
}
