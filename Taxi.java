package dice;

import java.util.Scanner;

public class Taxi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// �ýÿ�� ����ϱ�
		// 2km������ �⺻��� 3500��, 2km�� �ʰ��ϴ� ��� 142m ���� 100�� �߰�.
		float dist; // �Ÿ�
		int fare = 3500; // �ýÿ��

		System.out.print("�Ÿ� : ");
		dist = scan.nextFloat();
		/*
		 * if (dist <= 2) { fare = 3500; } else { fare = (int) (3500 + ((dist - 2) *
		 * 1000) / 142 * 100); if (((dist - 2) * 1000) % 142 != 0) fare += 100; }
		 */
		if (dist > 2) {
			fare = (int) (3500 + ((dist - 2) * 1000) / 142 * 100);
			if (((dist - 2) * 1000) % 142 != 0)
				fare += 100;
		}
		System.out.println("��� = " + fare + "��");
		scan.close();
	}

}
