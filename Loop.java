package loop;

import java.util.Scanner;
import java.util.Random;

public class Loop {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random r = new Random();
		/*
		 * // Ÿ�� ��ȣ�� 15 ��� �ڸ��� �ƿ� �ڸ� System.out.print("Ÿ�� �� :"); int tiles =
		 * scan.nextInt(); // �ٴڿ� �� Ÿ�� �� int moveTiles = 0; // �̵��� Ÿ�� �� int count = 0;
		 * // �õ��� Ƚ�� boolean isBroken = false; // �÷���(���) ���� while (moveTiles <= tiles)
		 * { // �ֻ��� ������ �̵��ϱ� moveTiles += r.nextInt(6) + 1; if (moveTiles % 15 == 0) {
		 * isBroken = true; // ����� ����� break; } count++; } if (!isBroken)
		 * System.out.println("�õ�Ƚ�� = " + count + "��"); else
		 * System.out.println("�ƿ��Ǿ����ϴ�. = " + count + "��");
		 */

		// â�� ������ ��Ǯ���� ������ �Է¹ް� �� �հ踦 ������
		// ������������ -99 �Է��� ����.
		int sum = 0;
		int num;
		// num = scan.nextInt(); // �ݺ������ �ʱ�ȭ
		/*while ((num=scan.nextInt()) != -99) {
			sum += num; // ���� ����
			// num = scan.nextInt(); //�ݺ����� ���� ����
		}
		*/
		while(true) {
			if((num=scan.nextInt()) == -99)
				break;
			sum += num;
		}
		System.out.println("�Ѽ���= " + sum);

		scan.close();
	}
}
