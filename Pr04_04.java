package conditional;

public class Pr04_04 {

	public static void main(String[] args) {
		// 1~100 ������ ������ ���� �� answer�� �����Ѵ�.
		int answer = (int) (Math.random() * 100) + 1;
		int input = 0;
		int count = 0;

		java.util.Scanner s = new java.util.Scanner(System.in);
		do {
			count++;
			System.out.print("1�� 100������ ���� �Է��ϼ���:");
			input = s.nextInt();

			if (answer == input) {
				System.out.println("�������ϴ�.");
				System.out.println("�õ�Ƚ����" + count + "���Դϴ�.");
				break;
			} else if (answer > input) {
				System.out.println("�� ū ���� �Է��ϼ���.");
			} else {
				System.out.println("�� ���� ���� �Է��ϼ���.");
			}
		} while (true);
	}
}
