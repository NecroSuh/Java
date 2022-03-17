package operator;

import java.util.Scanner;

public class Pr03_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		System.out.printf("정수를 입력하시오 :");
		num=scan.nextInt();
		System.out.println((num / 100) * 100);
		scan.close();
	}
}
