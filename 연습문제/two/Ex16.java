package two;

import java.util.Scanner;

public class Ex16 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num = 0;
		System.out.print("���� ���� 10���� �Է��Ͻÿ�>>");
		for (int i = 0; i < 10; i++) {
			num = scan.nextInt();
			if (num % 3 == 0)
				System.out.print(num+" ");
		}
		scan.close();
	}
}
