package two;

import java.util.Scanner;

public class Ex17 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] unit = { 50000, 10000, 1000, 500, 100, 50, 10, 1 };
		int cnt = 0;
		int nCnt = 0;

		System.out.print("�ݾ��� �Է��Ͻÿ�>>");
		int money = scan.nextInt();
		while (true) {
			if (money <= 0)
				break;
			if (money >= unit[cnt]) {
				money -= unit[cnt];
				nCnt++;
				if (money < unit[cnt]) {
					System.out.print(unit[cnt] + "�� ¥��: " + nCnt + "��\n");
					nCnt = 0;
					cnt++;
				}
			} else
				cnt++;
		}
		scan.close();
	}
}
